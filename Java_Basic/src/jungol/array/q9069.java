package jungol.array;

import java.util.Scanner;

public class q9069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year;
        int month;

        while (true) {
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();

            if(year == 0 && month == 0){
                break;
            }

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                if (month == 2) {
                    System.out.print("입력하신 달의 날 수는 29일입니다.\n");
                }
            } else {
                if (month > 12 || month < 1) {
                    System.out.print("잘못 입력하였습니다.\n");
                } else {
                    System.out.printf("입력하신 달의 수는 %d입니다.\n", arr[month - 1]);
                }
            }
        }


    }
}
