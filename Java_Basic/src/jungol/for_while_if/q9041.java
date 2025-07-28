package jungol.for_while_if;

import java.util.Scanner;

public class q9041 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("점수를 입력하세요. ");
            num = sc.nextInt();

            if(num >= 80 && num <=100){
                System.out.println("축하합니다. 합격입니다.");
            } else if (num>=0 && num <80) {
                System.out.println("죄송합니다. 불합격입니다. ");
            }else
                break;
        }

    }

}
