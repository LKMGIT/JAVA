package Object;

import java.util.ArrayList;
import java.util.Scanner;

class Book {

    String title;
    int score;
    static int count;

    public Book(String title, int score) {
        this.title = title;
        this.score = score;
    }
}


public class BookArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>(); // 배열을 동적으로 할당 하고 싶으면 ArrayList<>

        String title;
        int score;
        boolean check = true;

        while (check) {

            System.out.println("""
                    
                    ========================
                    1. 책 등록
                    2. 책 검색
                    3. 모든 책 출력
                    4. 종료
                    ========================
                    """);
            System.out.print("번호를 입력하세요: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    sc.nextLine();
                    System.out.print("제목: ");
                    title = sc.nextLine();
                    System.out.print("평점: ");
                    score = sc.nextInt();
                    books.add(new Book(title, score));
                    break;

                case 2:
                    System.out.print("검색할 책의 번호를 입력하세요: ");
                    int b_num = sc.nextInt();
                    title = books.get(b_num - 1).title;
                    score = books.get(b_num - 1).score;
                    System.out.println("책 제목 : " + title);
                    System.out.println("책 평점 : " + score);
                    break;

                case 3:
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println("책 번호 : " + (i + 1) + " 책 제목 : " + books.get(i).title + ", 책 평점 : " + books.get(i).score);
                    }
                    break;

                case 4:
                    System.out.println("종료");
                    check = false;
                    break;
            }
        }
    }
}
