package Object;

import java.util.Scanner;

class SafeArr{
    private int a[];
    public int lenght;

    public SafeArr(int size){
        a = new int[size];
        lenght = size;
    }

    public int getA(int index){
        if(index >=0 && index < lenght){
            return a[index];
        }
        return -1;
    }

    public void putA(int index, int value){
        if(index >=0 && index < lenght){
            a[index] = value;
        }else {
            System.out.println("OutofIndex");
        }
    }

}


public class SafeArray {

    public static void main(String[] args) {
        SafeArr arr = new SafeArr(3);

        for(int i = 0; i< arr.lenght+1; i++){
            arr.putA(i, i *10);
            System.out.println(arr.getA(i));
        }
    }
}
