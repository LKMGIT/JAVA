package jungol.string2;

import java.util.Scanner;

public class q9124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st1 = sc.nextLine();
        String[] strings = st1.split(" ");

        String s1Prefix = strings[0].length() >= 3 ? strings[0].substring(0, 3) : strings[0];
        String s2Prefix = strings[1].length() >= 3 ? strings[1].substring(0, 3) : strings[1];

        String newS1 = s2Prefix + strings[0].substring(3);
        String newS2 = strings[1] + s1Prefix;

        System.out.println(newS1);
        System.out.println(newS2);
    }
}
