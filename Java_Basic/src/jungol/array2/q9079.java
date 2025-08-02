package jungol.array2;

import java.util.Scanner;

public class q9079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[] subjectSum = new int[3];
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 학생의 점수 ", i + 1);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.printf("     국어 영어 수학 총점\n");

        for (int i = 0; i < arr.length; i++) {
            int studentSum = 0;
            System.out.printf(" %d번", i + 1);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
                studentSum += arr[i][j];
                subjectSum[j] += arr[i][j];
            }
            totalSum += studentSum;
            System.out.printf("%4d\n", studentSum);
        }

        System.out.print("합계");
        for (int j = 0; j < subjectSum.length; j++) {
            System.out.printf("%4d", subjectSum[j]);
        }
        System.out.printf("%4d\n", totalSum);
    }
}
