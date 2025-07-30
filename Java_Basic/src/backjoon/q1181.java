package backjoon;

import java.util.*;

public class q1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < num; i++) {
            wordSet.add(sc.nextLine());
        }

        List<String> wordList = new ArrayList<>(wordSet);

        wordList.sort((s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        for (String s : wordList) {
            System.out.println(s);
        }
    }
}
