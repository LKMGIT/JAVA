package jungol.string2;

import java.util.Scanner;

public class q9120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[]{"champion", "class"};

        System.out.print("문자를 입력하세요. ");
        String c = sc.nextLine();

        boolean found = false; // 해당 단어가 있는지 체크용

        for (String a : strings) {
            if (a.startsWith(c)) {
                System.out.println(a);
                found = true;
            }
        }

        if (!found) {
            System.out.println("찾는 단어가 없습니다.");
        }

        sc.close();
    }
}
