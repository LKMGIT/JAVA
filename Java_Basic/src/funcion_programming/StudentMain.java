package funcion_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMain {

    static boolean loop = true;
    static Scanner sc = new Scanner(System.in);
    static int member_count = 0;
    static List<Student> studentList = new ArrayList<>();
    static int check = 0;
    static int total = 0;
    static double avg = 0.0;

    // 화면 출력 함수
    public static void print_screen() {
        System.out.println("""
                -------------------------------------------------
                1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
                -------------------------------------------------""");
        System.out.print("선택 >");
        check = sc.nextInt();
        sc.nextLine();
    }

    //학생 수 입력
    public static void setMember_count() {
        System.out.print("학생 수 > ");
        member_count = sc.nextInt();
        sc.nextLine();
    }

    // 학생 점수 입력
    public static void add_score() {
        for (int i = 0; i < member_count; i++) {
            System.out.printf("학생%d의 점수 입력> ", i+1);
            int score = sc.nextInt();
            studentList.add(new Student(score));
        }
    }

    public static void print_list(List<Student> list){
       list.forEach(s-> System.out.println("점수" + s.score));
    }

    public static void setTotal(){
        total = studentList.stream().mapToInt(Student::getScore).sum();
        avg = studentList.stream().mapToInt(Student::getScore).average().orElse(0.0);
        System.out.println("총합 > " + total);
        System.out.println("평균 > " + avg);
    }

    public static void end_Loop(){
        loop = false;
    }


    public static void main(String[] args) {

        while (loop) {
            print_screen();

            switch (check) {
                case 1 -> setMember_count();
                case 2 -> add_score();
                case 3 -> print_list(studentList);
                case 4 -> setTotal();
                case 5 -> end_Loop();

            }
        }

        System.out.println("종료");

    }


}
