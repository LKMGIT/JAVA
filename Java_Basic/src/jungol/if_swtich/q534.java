package jungol.if_swtich;

import java.util.Scanner;

public class q534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String score = sc.nextLine();

        if (score.equals("A")) {
            System.out.println("Excellent");
        } else if (score.equals("B")) {
            System.out.println("Good");
        } else if (score.equals("C")) {
            System.out.println("Usually");
        } else if (score.equals("D")) {
            System.out.println("Effort");
        } else if (score.equals("F")) {
            System.out.println("Failure");
        } else {
            System.out.println("error");
        }


    }
}
