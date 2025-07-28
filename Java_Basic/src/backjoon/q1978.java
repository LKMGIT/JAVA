package backjoon;

import java.util.Scanner;

public class q1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int num2;
        int count = 0;

        num = sc.nextInt();

        for(int i = 0; i < num; i++){
            num2 = sc.nextInt();
            boolean check = true;

            for(int j = 2; j < num2; j++){
                if(num2 % j == 0){
                    check = false;
                }
            }

            if(num2!= 1 && check)
                count++;

        }

        System.out.println(count);
    }

}
