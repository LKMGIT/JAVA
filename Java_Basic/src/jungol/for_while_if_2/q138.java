package jungol.for_while_if_2;

import java.util.Scanner;

public class q138 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i<num; i++){
            for(int j = 0; j < num; j ++){
                System.out.printf("(%d, %d) ", i+1, j+1);
            }
            System.out.println("");
        }
    }
}
