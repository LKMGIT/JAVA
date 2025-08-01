package jungol.array2;

import java.util.ArrayList;
import java.util.Scanner;

public class q9075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int[] arr = new int[10];

        while (loop) {
            int num = sc.nextInt();

            if (num != 0) {
                arr[num % 10]++;
            } else {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                System.out.printf("%d : %d개\n", i, arr[i]);
        }

    }
}
