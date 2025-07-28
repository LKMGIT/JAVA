package jungol.for_while_if_2;

import java.util.Scanner;

public class q131 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for(int i = min; i <= max; i++){
            System.out.print(i + " ");
        }


    }
}
