package jungol.for_while_if;

import java.util.Scanner;

public class q538 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("number? ");
            num = sc.nextInt();

            if(num > 0)
                System.out.println("positive integer");
            else if (num < 0)
                System.out.println("negative number");
            else
                break;

        }

    }
}
