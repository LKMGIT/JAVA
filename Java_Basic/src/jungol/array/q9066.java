package jungol.array;

import java.util.Scanner;

public class q9066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[] = new char[26];
        int j = 0;

        for(int i = 65; i<91; i++){
            arr[j] = (char)i;
            j++;
        }

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
