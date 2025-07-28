package jungol.for_while_if_2;

import java.util.Scanner;

public class q135 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for(int i = min; i <= max; i ++){

            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
                count++;
            }

        }

        avg = (double) sum / count;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);


    }
}
