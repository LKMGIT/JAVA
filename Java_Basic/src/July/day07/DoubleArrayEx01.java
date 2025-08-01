package July.day07;

import java.util.Scanner;

public class DoubleArrayEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[3][3];
        String[] a = new String[]{"국어", "수학", "영어"};

        for(int i = 0; i< 3; i++){
            for(int j = 0; j< 3; j++){
                System.out.print("학생"+(i+1)+a[j]+" 점수 입력 : ");
                score[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i ++){
            int sum = 0;
            double avg = 0.0;
            System.out.print("학생" +(i+1)+ ": ");
            for(int j = 0; j < 3 ; j ++){
                System.out.print(score[i][j]+ " ");
                sum += score[i][j];
            }
            System.out.println("");
            avg = (double)sum / 3;
            System.out.println("학생" +(i+1)+ "총점 : " + sum + " 평균 : " + avg);
        }

    }
}
