package jungol.stringtest;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while(loop){

            char a = sc.nextLine().charAt(0);
            System.out.printf("%c -> %d\n", a, (int)a);

            if(a == '0'){
                loop = false;
                break;
            }


        }


    }
}
