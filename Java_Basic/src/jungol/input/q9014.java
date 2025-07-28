package jungol.input;

import java.util.Scanner;

public class q9014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 나이는 몇 살입니까? ");
        int age = sc.nextInt();

        System.out.printf("당신의 나이는 %d살이군요.",age);
    }
}
