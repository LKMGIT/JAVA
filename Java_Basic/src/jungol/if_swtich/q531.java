package jungol.if_swtich;

import java.util.Scanner;

public class q531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();

        if(weight > 88.45){
            System.out.print("Heavyweight");
        }else if(weight > 72.57 && weight <= 88.45){
            System.out.print("Cruiserweight");
        }else if(weight > 61.23 && weight <= 72.57){
            System.out.print("Middleweight");
        }else if(weight > 50.80 && weight <= 61.23){
            System.out.print("Lightweight");
        }else{
            System.out.print("Flyweight");
        }

    }
}
