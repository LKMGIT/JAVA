package jungol.string2;

import java.util.Scanner;

public class q9128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String[] strings = str1.split(" ");

        String str2 = sc.nextLine();
        String[] strings2 = str2.split(" ");

        int num = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);
        double num2 = Double.parseDouble(strings2[0]) + Double.parseDouble(strings2[1]);

        System.out.printf("%s + %s = %d \n", strings[0], strings[1], num);
        System.out.printf("%.2f + %.2f = %.2f ", Double.parseDouble(strings2[0]), Double.parseDouble(strings2[1]), num2);


    }
}
