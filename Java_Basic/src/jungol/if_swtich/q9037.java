package jungol.if_swtich;

import java.util.Scanner;

public class q9037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");
        int num = sc.nextInt();

        if(num >= 90){
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        }else if (num >= 70) {
            System.out.println("C");
        }else if (num >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }


    }
}
