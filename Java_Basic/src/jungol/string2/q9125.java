package jungol.string2;

import java.util.Scanner;

public class q9125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = {
                "champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        String str1 = sc.nextLine();
        boolean found1 = false;

        for (String word : strings) {
            if (word.contains(str1)) {
                System.out.println(word);
                found1 = true;
            }
        }

        if (!found1) {
            System.out.println("찾는 단어가 없습니다.");
        }

        System.out.print("문자열을 입력하세요. ");
        String str2 = sc.nextLine();
        boolean found2 = false;

        for (String word : strings) {
            if (word.contains(str2)) {
                System.out.println(word);
                found2 = true;
            }
        }

        if (!found2) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
