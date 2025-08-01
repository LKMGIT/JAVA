package jungol.stringtest;

import java.util.Scanner;

public class q9114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while(loop){

            char c = sc.nextLine().charAt(0);

            if(c>=48 && c<=57){
                System.out.println("숫자문자입니다.");
            } else if (c>=65 && c<=90) {
                System.out.println("대문자입니다.");
            } else if (c>=97 && c <= 122) {
                System.out.println("소문자입니다.");
            }else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                loop = false;
            }
        }

        // 48 이상 57 이하, 65 이상, 90 이하, 97 이상, 122 이하


    }
}
