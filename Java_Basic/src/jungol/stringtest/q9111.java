package jungol.stringtest;

import java.util.Scanner;

public class q9111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "jungol olympiad";

        for (int i = 0; i < 5; i++) {
            int index = sc.nextInt();
            System.out.print(str1.charAt(index));
        }


    }
}
