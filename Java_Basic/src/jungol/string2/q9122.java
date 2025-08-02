package jungol.string2;

import java.util.Scanner;

public class q9122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] arr = str1.split(" ");

        if(arr[0].length() > arr[1].length()){
            System.out.println(arr[1]);
            System.out.println(arr[0]);
        } else if (arr[0].length() < arr[1].length()) {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
        }else {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
        }


    }
}
