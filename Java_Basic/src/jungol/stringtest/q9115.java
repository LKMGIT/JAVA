package jungol.stringtest;

import java.util.Scanner;

public class q9115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st1 = sc.nextLine();
        String result = "";

        for(int i = 0 ; i< st1.length(); i++){
            if(st1.charAt(i) >= 'A' && st1.charAt(i) <= 'Z'){
                result += (char)(st1.charAt(i)+32);
            } else if (st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z') {
                result += (char)(st1.charAt(i)-32);
            }else {
                result += st1.charAt(i);
            }
        }
        System.out.print(result);

    }
}
