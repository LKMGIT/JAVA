package javabasic;

import java.util.Scanner;


public class JavaBasic8 {

    static int account = 0;

    public static void in_account(int money) {
        account += money;
    }

    public static void out_account(int money){
        account -= money;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int money = 0;

        while (loop) {
            System.out.println("""
                    -----------------------------------
                    1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
                    -----------------------------------""");

            System.out.print("선택> ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("예금액> ");
                    money = sc.nextInt();
                    in_account(money);
                    break;
                case 2:
                    System.out.print("출금액> ");
                    money = sc.nextInt();
                    out_account(money);
                    break;
                case 3:
                    System.out.printf("잔고> %d\n", account);
                    break;
                case 4:
                    loop = false;
                    break;
            }
        }
        System.out.print("프로그램 종료");


    }
}
