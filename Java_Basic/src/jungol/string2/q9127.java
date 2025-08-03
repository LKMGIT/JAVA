package jungol.string2;

import java.util.Arrays;
import java.util.Scanner;

public class q9127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];

        System.out.println("단어 5개를 입력하세요.");

        for(int i = 0; i < strings.length; i ++){
            strings[i] = sc.nextLine();
        }

        Arrays.sort(strings);

        for(int i = 0; i < strings.length; i ++){
            System.out.println(strings[i]);
        }


    }
}
