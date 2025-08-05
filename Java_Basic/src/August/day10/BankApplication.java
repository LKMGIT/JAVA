package August.day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        Bank bank = new Bank();

        boolean loop = true;
        int input;

        try {
            while (loop) {
                bank.print_screen();
                input = sc.nextInt();
                sc.nextLine();

                switch (input) {
                    case 1 -> accounts.add(bank.make_account(sc));
                    case 2 -> bank.account_list(accounts);
                    case 3 -> bank.add_balance(sc, accounts);
                    case 4 -> bank.out_balance(sc, accounts);
                    case 5 -> loop = bank.Exit();
                }
            }

            System.out.println("이용해주셔서 감사합니다 :)");
        } catch (InputMismatchException e) {
            System.out.println("입력이 올바르지 않습니다.");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("오류 발생! " + e.getMessage());
            sc.nextLine();
        }

    }
}
