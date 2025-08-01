package jungol.stringtest;

import java.util.Scanner;

public class q9116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        str1.chars().mapToObj(c -> (char) c)
                .forEach(character -> {
                    if(character == ' '){
                        System.out.println();
                    }else {
                        System.out.print(character);
                    }
                });


    }
}
