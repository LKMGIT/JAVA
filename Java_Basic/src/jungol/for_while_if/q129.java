package jungol.for_while_if;

import java.util.Scanner;

public class q129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.print("Base = ");
            if (!sc.hasNextInt()) break; // 입력 종료 or 잘못된 입력 시 종료
            int base = sc.nextInt();

            System.out.print("Height = ");
            if (!sc.hasNextInt()) break;
            int height = sc.nextInt();

            double width = (double) base * height / 2;
            System.out.printf("Triangle width = %.1f\n", width);

            System.out.print("Continue? ");
            sc.nextLine(); // 개행 제거
            String c = sc.nextLine();

            if (c.equalsIgnoreCase("N")) {
                check = false;
            }
        }

        sc.close();
    }
}
