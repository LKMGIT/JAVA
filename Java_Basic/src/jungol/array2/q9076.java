package jungol.array2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class q9076 {
    public static void main(String[] args) {

        int[] arr = new int[40];

        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i< arr.length; i ++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println();

        System.out.printf("피보나치 수열 10항 : %d\n", arr[9]);
        System.out.printf("피보나치 수열 20항 : %d\n", arr[19]);
        System.out.printf("피보나치 수열 30항 : %d\n", arr[29]);
        System.out.printf("피보나치 수열 40항 : %d", arr[39]);


    }
}
