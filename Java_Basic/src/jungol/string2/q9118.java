package jungol.string2;

import java.util.Scanner;

public class q9118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        for(int i = 0; i < 5; i ++){
            arr[i] = sc.nextLine();
        }

        for(String a : arr){
            System.out.println(a);
        }

    }
}
