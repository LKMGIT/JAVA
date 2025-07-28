package jungol.for_while_if;

import java.util.Scanner;

public class q633 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check = true;

        while(check){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");

            int num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.println("\nSeoul\n");
                    break;
                case 2:
                    System.out.println("\nWashington\n");
                    break;
                case 3:
                    System.out.println("\nTokyo\n");
                    break;
                case 4:
                    System.out.println("\nBeijing\n");
                    break;
                default:
                    System.out.println("\nnone");
                    check = false;
                    break;
            }
        }
    }
}
