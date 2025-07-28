package jungol.for_while_if_2;

import java.util.Scanner;

public class q133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        double avg = 0.0;

        for(int i =0 ; i< num; i ++){
            int a = sc.nextInt();
            sum += a;
        }

        avg = (double) sum / num;
        System.out.printf("%.2f", avg);

    }
}
