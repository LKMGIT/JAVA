package jungol.if_swtich;

import java.util.Scanner;

public class q532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if(num1 >= 4.0 && num2 >= 4.0){
            System.out.print("A");
        }else if(num1 >= 3.0 && num2 >= 3.0){
            System.out.print("B");
        }else{
            System.out.print("C");
        }
    }
}
