package August.day09;

import java.util.Scanner;

public class ComputerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer c = new Computer();
        int[] num_arr = new int[5];

        String num = sc.nextLine();
        String[] arr = num.split(" ");

        for(int i = 0; i< arr.length; i ++){
            num_arr[i] = Integer.parseInt(arr[i]);
        }

        System.out.printf("%d 부터 %d 까지 합은 %d 입니다.", num_arr[0], num_arr[4], c.totalSum(num_arr));



    }
}
