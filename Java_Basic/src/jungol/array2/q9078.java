package jungol.array2;

import java.util.Scanner;

public class q9078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("첫 번째 배열 %d행 ", i + 1);
            for(int j = 0 ; j < arr1.length; j ++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("두 번째 배열 %d행 ", i + 1);
            for(int j = 0 ; j < arr2.length; j ++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.printf("%d ", result[i][j]);
            }
            System.out.println();
        }
    }
}
