package jungol.for_while_if;

public class q9040 {

    public static void main(String arg[]){

        int sum = 0;
        int num = 1;

        while(num<11){

            sum += num;
            num++;

        }

        System.out.println("1부터 10까지의 합 = "+ sum );
        System.out.println("while문이 끝난 후의 num의 값 = "+ num );


    }
}
