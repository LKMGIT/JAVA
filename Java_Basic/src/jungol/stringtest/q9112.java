package jungol.stringtest;

import java.util.Scanner;

public class q9112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", str1.length());
        for(int i = str1.length()-1; i>=0; i--){
            System.out.print(str1.charAt(i));
        }

    }
}
