package jungol.string2;

import java.util.Scanner;

public class q9126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String[] strings = str1.split(" ");

        if(strings[0].compareTo(strings[1]) > 0){
            System.out.printf("%s 가(이) 더 큽니다.\n", strings[0]);
        } else if (strings[0].compareTo(strings[1]) < 0) {
            System.out.printf("%s 가(이) 더 큽니다.\n", strings[1]);
        }else {
            System.out.println("두 문자열은 같습니다.\n");
        }

        String str2 = strings[0].substring(0,3);
        String str3 = strings[1].substring(0,3);

        if(str2.equals(str3)){
            System.out.println("앞의 세 문자가 같습니다.");
        } else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }


    }
}
