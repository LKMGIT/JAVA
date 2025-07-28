package backjoon;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class q2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c_num = sc.nextInt();
        int Max_num = sc.nextInt();
        int max = 0;
        int arr[] = new int[c_num];
        int result = 0;

        for (int i = 0; i < c_num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    result = arr[i] + arr[j] + arr[k];
                    if (result <= Max_num && result > max) {
                        max = result;
                    }
                }
            }
        }

        System.out.println(max);

    }
}
