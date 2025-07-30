package jungol.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q9073 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(95, 75, 85, 100, 50));

        Collections.sort(arrayList);

        for(int a : arrayList){
            System.out.print(a+ " ");
        }


    }
}
