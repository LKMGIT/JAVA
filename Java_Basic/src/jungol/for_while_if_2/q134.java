package jungol.for_while_if_2;

import java.util.Scanner;

public class q134 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;


        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("even : "+ even);
        System.out.println("odd : "+ odd);


    }
}
