package August.day09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("학생 수 입력 > ");
            int num = sc.nextInt();
            sc.nextLine(); // 버퍼 정리

            Student[] students = new Student[num];

            Student student = new Student("", 0, "", 0); // 임시 객체로 setValue 호출
            student.setValue(num, students, sc);

            System.out.println("\n===== 입력한 학생 정보 =====");
            for (int i = 0; i < num; i++) {
                System.out.println(students[i]); // toString() 자동 호출
            }

        } catch (InputMismatchException e) {
            System.out.println("입력 오류");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("오류 발생" + e.getMessage());
            sc.nextLine();

        }
    }
}
