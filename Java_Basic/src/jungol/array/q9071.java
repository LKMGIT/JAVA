package jungol.array;

import java.util.Scanner;

public class q9071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int max = 0;
        int min = 0;

        for(int i = 0 ; i < 10 ; i ++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for(int i = 0; i < 10; i++){
            if(arr[i] % 2 == 0){
                max = Math.max(arr[i], max);
            }else{
                min = Math.min(arr[i],min);
            }
        }

        System.out.printf("%d %d", min, max);

    }
}
