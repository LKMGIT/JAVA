package jungol.array2;

import java.util.Arrays;
import java.util.Scanner;

public class q9074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int[] arr = new int[]{0,0,0,0,0,0,0,0,0,0};

        while(loop){

            int num = sc.nextInt();
            if(num > 10 || num < 1){
                break;
            }else {
                arr[num-1]++;
            }
        }

        for(int i = 0; i< arr.length; i ++){
            if(arr[i] != 0){
                System.out.printf("%d : %d개\n",i+1, arr[i]);
            }
        }

    }
}
