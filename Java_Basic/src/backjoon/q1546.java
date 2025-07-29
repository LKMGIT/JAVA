package backjoon;

import java.util.Scanner;

public class q1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double[] arr = new double[num];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < num; i++) {
            int score = sc.nextInt();
            arr[i] = score;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>= max)
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
        }

        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }

        System.out.printf("%.2f",sum/ arr.length);
    }
}
