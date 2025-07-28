package jungol.for_while_if;

import java.util.Scanner;

public class q9043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        int count = 0;
        int avg = 0;


        while(true){

            num = sc.nextInt();

            if(num == 0){
                break;
            }else {
                if(num % 2 != 0){
                    sum += num;
                    count++;
                }
            }
        }

        avg = sum / count;

        System.out.println("홀수의 합 = " + sum);
        System.out.print("홀수의 평균 = " + avg);

    }

}
