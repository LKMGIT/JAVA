package jungol.for_while_if;

import java.util.Scanner;

public class q126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        while (true) {

            int num = sc.nextInt();

            if (num != 0) {
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                break;
            }

        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }

}
