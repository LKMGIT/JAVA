package jungol.string2;

import java.util.Scanner;

public class q9119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        for(int i = 0; i < str1.length(); i ++){
            if(str1.charAt(i) == ' '){
                System.out.println("");
            }else{
                System.out.print(str1.charAt(i));
            }
        }



    }
}
