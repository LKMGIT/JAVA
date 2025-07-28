package jungol.for_while_if;

import java.util.Scanner;

public class q9042 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        int count = 0;
        String result ;

        while(true){
            num = sc.nextInt();
            if(num == 0)
                break;
            else{
                sum += num;
                count++;
            }

        }

        result = String.format("%.2f", (float)sum/count);

        System.out.println("입력된 자료의 개수 = " + count);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.print("입력된 자료의 평균 = " + result);

    }
}
