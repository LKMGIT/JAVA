package August.day09;

import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private String address;
    private int student_number;
    private int language_score;
    private int math_score;
    private int english_score;
    private int total;
    private double avg;

    public Student(String name, int age, String area, int student_number) {
        this.name = name;
        this.age = age;
        this.address = area;
        this.student_number = student_number;
    }

    public Student(String name, int age, String address, int student_number, int language_score, int math_score, int english_score, int total, double avg) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.student_number = student_number;
        this.language_score = language_score;
        this.math_score = math_score;
        this.english_score = english_score;
        this.total = total;
        this.avg = avg;
    }


    public void setValue(int num, Student[] students, Scanner sc){
        for(int i = 0; i < num; i ++){
            System.out.printf("%d번 학생 이름: ", i+1);
            String name = sc.nextLine();

            System.out.printf("%d번 학생 나이: ", i + 1);
            int age = sc.nextInt();
            sc.nextLine();

            System.out.printf("%d번 학생 주소: ", i+1);
            String address = sc.nextLine();

            System.out.printf("%d번 학생 학번 : ", i+1);
            int student_number = sc.nextInt();
            sc.nextLine();

            System.out.printf("%d번 학생 국어 점수 : ", i+1);
            int language_score = sc.nextInt();
            sc.nextLine();

            System.out.printf("%d번 학생 수학 점수 : ", i+1);
            int math_score = sc.nextInt();
            sc.nextLine();

            System.out.printf("%d번 학생 영어 점수 : ", i+1);
            int english_score = sc.nextInt();
            sc.nextLine();

            int sum = language_score + math_score + english_score;
            double result = (double) sum / 3;

            Student student = new Student(name, age, address, student_number, language_score, math_score, english_score, sum, result);
            students[i] = student;
        }
    }

    @Override
    public String toString() {
        return "학생{" +
                "이름='" + name + '\'' +
                ", 나이=" + age +
                ", 주소='" + address + '\'' +
                ", 학번=" + student_number +
                ", 국어점수=" + language_score +
                ", 수학점수=" + math_score +
                ", 영어점수=" + english_score +
                ", 총점=" + total +
                ", 평균=" + avg +
                '}';
    }
}
