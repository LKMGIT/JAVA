package backjoon;

import java.util.Scanner;

public class q2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 1;
        int i = 1;
        int j = 6;
        int sum = 1;

        while (sum<num){
            sum += j*i;
            i++;
            count++;
        }

        System.out.println(count);

    }
// 1, 6, 12, 18, 24, 30
// 1, 2, 3, 4, 5
}
