package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1929 {

    static void isPrime_fun(int num1, int num2){
        boolean[] isPrime = new boolean[num2 + 1];

        // 소수 초기화
        for (int i = 2; i <= num2; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체
        for (int i = 2; i * i <= num2; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num2; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 결과 출력
        for (int i = num1; i <= num2; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        isPrime_fun(num1, num2);
    }
}
