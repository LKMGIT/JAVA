package jungol.stringtest;

import java.util.Scanner;

public class q9117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length();

        // 문자열 길이만큼 회전
        for (int i = 1; i <= len; i++) {
            String rotated = str.substring(i) + str.substring(0, i);
            System.out.println(rotated);
        }
    }
}
