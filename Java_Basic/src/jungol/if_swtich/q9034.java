package jungol.if_swtich;

import java.util.Scanner;

public class q9034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        if(d1 >=4 && d2 >=4){
            System.out.print("이겼습니다.");
        }else if(d1 >= 4 || d2 >= 4){
            System.out.print("비겼습니다.");
        }else{
            System.out.print("졌습니다.");
        }
    }
}
