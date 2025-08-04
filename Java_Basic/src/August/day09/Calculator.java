package August.day09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    static void screen_print() {
        System.out.println("""
                ===================================
                            사칙연산 계산기
                ===================================
                  1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 
                
                두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해주세요> """);
    }

    static int adder(int num1, int num2) {
        return num1 + num2;
    }

    static int minus(int num1, int num2) {
        return num1 - num2;
    }

    static int multi(int num1, int num2) {
        return num1 * num2;
    }

    static int div(int num1, int num2) {
        return num1 / num2;
    }

    static void calculator(String[] data) {

        int num1 = Integer.parseInt(data[0]);
        int num2 = Integer.parseInt(data[1]);
        int num3 = Integer.parseInt(data[2]);

        switch (num3) {
            case 1 -> System.out.printf("결과는 %d + %d = %d\n", num1, num2, adder(num1, num2));
            case 2 -> System.out.printf("결과는 %d - %d = %d\n", num1, num2, minus(num1, num2));
            case 3 -> System.out.printf("결과는 %d * %d = %d\n", num1, num2, multi(num1, num2));
            case 4 -> System.out.printf("결과는 %d / %d = %d\n", num1, num2, div(num1, num2));
        }

    }

    static void input(){
        String input = sc.nextLine();
        String[] data = input.split(" ");
        calculator(data);
    }

    public static void main(String[] args) {

        while (loop) {
            try {
                screen_print();
                input();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("오류 발생" + e.getMessage());
                sc.nextLine();
            }

        }

    }
}
