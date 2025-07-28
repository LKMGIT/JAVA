package jungol.array;

import java.util.ArrayList;
import java.util.Scanner;

public class q9067 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< 10; i++){
            int num = sc.nextInt();
            arr.add(num);
        }

        System.out.printf("%d %d %d", arr.get(2), arr.get(4), arr.get(arr.size()-1));




    }
}
