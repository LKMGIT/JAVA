package jungol.if_swtich;

import java.util.Scanner;

public class q9030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);

        if(num > 10)
            System.out.print("10보다 큰 수를 입력하셨습니다.");
        else
            System.out.print("10보다 작은 수를 입력하셨습니다.");

    }
}
