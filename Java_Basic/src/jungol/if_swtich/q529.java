package jungol.if_swtich;

import java.util.Scanner;

public class q529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();
        int result = weight + 100 - height;

        if(result > 0 ){
            System.out.println(result);
            System.out.print("Obesity");
        }else{
            System.out.println(result);
        }

    }
}
