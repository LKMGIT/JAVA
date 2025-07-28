package jungol.for_while_if;

import java.util.Arrays;
import java.util.Scanner;

public class q9045 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("""
                    1. 입력하기
                    2. 출력하기
                    3. 삭제하기
                    4. 끝내기
                    """);
            System.out.print("작업할 번호를 선택하세요. ");
            int num = sc.nextInt();

            if(num <1 || num >4){
                System.out.println("\n잘못 입력하였습니다.\n");
            } else if (num == 4) {
                System.out.println("\n끝내기를 선택하였습니다.");
                break;
            } else if (num == 2) {
                System.out.println("\n출력하기를 선택하였습니다.\n");
            }


        }


    }
}
