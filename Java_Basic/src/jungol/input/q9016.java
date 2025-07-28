package jungol.input;

import java.util.Scanner;

public class q9016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요. ");
        int height = sc.nextInt();
        System.out.print("몸무게를 입력하세요. ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("이름을 입력하세요. ");
        String name = sc.nextLine();

        System.out.println("키 = "+height);
        System.out.printf("몸무게 = %.1f\n", weight);
        System.out.print("이름 = "+name);

    }
}
