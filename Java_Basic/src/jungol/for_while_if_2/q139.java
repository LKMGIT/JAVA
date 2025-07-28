package jungol.for_while_if_2;

import java.util.Scanner;

public class q139 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        for (int j = 1; j <= 9; j++) {
            if(num1 > num2){
                for (int i = num1; i >= num2; i--) {
                    System.out.printf("%d * %d = %2d   ", i, j, i * j);
                }
            }else {
                for (int i = num1; i <= num2; i++) {
                    System.out.printf("%d * %d = %2d   ", i, j, i * j);
                }
            }

            System.out.println("");
        }
    }
}

