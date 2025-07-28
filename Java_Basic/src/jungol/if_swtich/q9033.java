package jungol.if_swtich;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q9033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("점수를 입력하세요. ");
            int score = sc.nextInt();

            if (score >= 90)
                System.out.print("A");
            else if (score >= 80 && score < 90) {
                System.out.print("B");
            } else if (score >= 70 && score < 80) {
                System.out.print("C");
            } else if (score >= 60 && score < 70) {
                System.out.print("D");
            } else {
                System.out.print("F");
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능");
        }
    }
}
