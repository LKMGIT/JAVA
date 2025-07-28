package jungol.array;

import java.util.Scanner;

public class q9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i =0; i< 5; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
