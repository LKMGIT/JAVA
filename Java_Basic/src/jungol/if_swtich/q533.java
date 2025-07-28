package jungol.if_swtich;

import java.util.Scanner;

public class q533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        String sex = input[0];              // 성별
        int age = Integer.parseInt(input[1]); // 나이

        if (sex.equals("M")) {
            System.out.print(age >= 18 ? "MAN" : "BOY");
        } else if (sex.equals("F")) {
            System.out.print(age >= 18 ? "WOMAN" : "GIRL");
        }

        sc.close();
    }
}
