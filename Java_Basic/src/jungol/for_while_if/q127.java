package jungol.for_while_if;

import java.util.Scanner;

public class q127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;
        double avg = 0;


        while (true) {
            int num = sc.nextInt();

            if(num <= 100 && num >= 0){
                sum += num;
                count++;
            }else {
                break;
            }
        }

        if(count != 0){
            avg = (float) sum / count ;
        }else{
            System.out.println("나누는 값이 0 입니다.");
        }

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);

    }
}
