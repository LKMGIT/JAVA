package jungol.array;

import java.util.Scanner;

public class q9070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;

        for(int i = 0 ; i < 10 ; i ++){
            int num = sc.nextInt();
            arr[i] = num;

            max = Math.max(arr[i], max);

        }
        System.out.println(max);

    }
}
