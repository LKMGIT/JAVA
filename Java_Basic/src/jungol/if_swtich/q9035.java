package jungol.if_swtich;

import java.util.Scanner;

public class q9035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("세 수를 입력하세요. ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int temp1 = Math.max(num1, num2);
        int temp2 = Math.max(num2, num3);

        int max = Math.max(temp1, temp2);

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", max);


    }
}
