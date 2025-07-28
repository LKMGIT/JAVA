package jungol.for_while_if;

import java.util.Scanner;

public class q539 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int count = 0;
        int sum = 0;
        String result;

        while(true){

            num = sc.nextInt();
            sum += num;
            count++;

            if(num >=100){
                break;
            }

        }

        result = String.format("%.1f", (float)sum/count);

        System.out.println(sum);
        System.out.print(result);
    }
}
