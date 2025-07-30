package jungol.array;

import java.util.Scanner;

public class q9072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[10];
        for(int i = 0 ; i < 10 ; i ++){
            int num = sc.nextInt();

            arr[i] = num;
        }

        int sum = 0 ;

        for(int i = 0 ; i < arr.length; i ++){
            sum += arr[i];
        }

        System.out.println("총점 = " +sum);
        System.out.printf("평균 = %.1f", (double)sum/arr.length);

    }
}
