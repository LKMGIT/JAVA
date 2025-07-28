package backjoon;

import java.util.Scanner;

public class q2231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        for (int i = 1; i < num; i++) {
            if (op(i) == num) {
                result = i;
                break;
            }
        }

        System.out.println(result); // 생성자가 없으면 0 출력
    }

    public static int op(int a) {
        int sum = a;  // 시작은 자기 자신
        while (a > 0) {
            sum += a % 10; // 일의 자리수 더하기
            a /= 10;       // 다음 자릿수
        }
        return sum;
    }
}
