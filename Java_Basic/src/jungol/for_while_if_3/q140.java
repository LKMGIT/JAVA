package jungol.for_while_if_3;

import java.util.Scanner;

public class q140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for(int i  =0; i< 20; i ++){
            int num = sc.nextInt();
            sum += num;
            if(num == 0){
                break;
            }
            count++;

        }

        int avg = sum / count;

        System.out.printf("%d %d", sum, avg);

    }
}
