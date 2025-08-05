package August.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    //화면 출력
    public void print_screen() {
        System.out.println("""
                ---------------------------------------------
                1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                ---------------------------------------------""");
        System.out.print("선택> ");
    }

    //걔좌 생성
    public Account make_account(Scanner sc) {
        Account account = new Account();
        System.out.println("""
                ----------
                계좌생성
                ----------""");

        System.out.print("계좌번호: ");
        String account_number = sc.nextLine();
        account.setAccount_number(account_number);

        System.out.print("계좌주: ");
        String account_name = sc.nextLine();
        account.setAccount_name(account_name);

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(sc.nextLine());
        account.setBalance(balance);

        System.out.println("계좌가 생성되었습니다.");
        return account;
    }

    public void account_list(ArrayList<Account> accounts) {
        System.out.println("""
                ----------
                계좌목록
                ----------""");

        for (Account a : accounts) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }


    public void add_balance(Scanner sc, ArrayList<Account> accounts) {
        Account target = null;

        System.out.println("""
                ----------
                예금
                ----------""");

        System.out.print("계좌번호: ");
        String account_number = sc.nextLine();

        System.out.print("예금액: ");
        int balance = sc.nextInt();
        sc.nextLine();

        for (Account a : accounts) {
            if (a.getAccount_number().equals(account_number)) {
                target = a;
                break;
            }
        }

        if (target != null) {
            target.add_balance(balance);
            System.out.println("결과 : 예금이 성공되었습니다. ");
        }
    }

    public void out_balance(Scanner sc, ArrayList<Account> accounts) {
        Account target = null;

        System.out.println("""
                ----------
                출금
                ----------""");


        System.out.print("계좌번호: ");
        String account_number = sc.nextLine();

        System.out.print("출금액: ");
        int balance = sc.nextInt();
        sc.nextLine();

        for (Account a : accounts) {
            if (a.getAccount_number().equals(account_number)) {
                target = a;
                break;
            }
        }

        if (target != null) {
            target.out_balance(balance);
            System.out.println("출금이 성공 되었습니다.");
        }

    }

    public boolean Exit() {
        return false;
    }

}
