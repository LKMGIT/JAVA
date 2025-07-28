package jungol.array;

import java.util.ArrayList;
import java.util.Scanner;

public class q9068 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                arr.add(num);
            } else {
                for(int j = 1; j < arr.size(); j+=2){
                    System.out.print(arr.get(j)+ " ");
                }
                break;
            }

        }


    }
}
