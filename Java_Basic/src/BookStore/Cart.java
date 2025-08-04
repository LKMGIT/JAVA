package BookStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    String book_name = " ";
    int book_count = 0;
    Book targetBook = null;
    char check = ' ';

    //바구니 항목 추가 메서드
    void menuCartAddItem(Scanner sc, ArrayList<Book> bookArrayList) {
        System.out.print("장바구니에 추가할 책 이름을 입력해주세요: ");
        book_name = sc.nextLine();

        System.out.print("책의 수량을 입력해주세요: ");
        book_count = sc.nextInt();
        sc.nextLine();

        Book book1 = new Book(book_name, book_count);
        System.out.printf("장바구니에 %s 책을 %d개 추가하였습니다. \n\n", book_name, book_count);
        bookArrayList.add(book1);
    }

    //장바구니 상품 목록 확인 메서드
    void menuCartItemList(ArrayList<Book> bookArrayList) {
        //장바구니 상품 목록 확인 부분
        //장바구니가 비어있지 않으면 현재 장바구니 상태 출력
        if (!bookArrayList.isEmpty()) {
            System.out.println("======현재 고객님의 장바구니 상품 목록======");
            bookArrayList.forEach(book -> System.out.println(book));
        } else {
            //장바구니가 비어 있으면 장바구니가 비어 있다고 알림
            System.out.println("현재 장바구니가 비어있습니다.\n");
        }
    }

    //장바구니 비우기 메서드
    void menuCartClear(ArrayList<Book> bookArrayList, Scanner sc) {
        System.out.print("장바구니를 정말 비우시겠습니까? (Y/N) : ");
        check = sc.nextLine().toUpperCase().charAt(0);

        if (check == 'Y') {
            bookArrayList.clear();
            System.out.println("장바구니를 비웠습니다. \n");
        } else {
            System.out.println("장바구니 비우기를 취소했습니다. \n");
        }
    }

    void menuCartRemoveItemCount(Scanner sc, ArrayList<Book> bookArrayList) {
        System.out.print("수량을 줄일 책의 이름을 입력해주세요: ");
        book_name = sc.nextLine();

        for (Book book : bookArrayList) {
            if (book.getBook_name().equals(book_name)) {
                targetBook = book;
                break;
            }
        }

        if (targetBook == null) {
            System.out.println("장바구니에 책이 없습니다.");
            return;
        }

        System.out.print("수량을 몇개로 변경하시겠습니까?(0개 : 삭제): ");
        book_count = sc.nextInt();
        sc.nextLine();

        //기존 값에 덮어쓰기
        if (!(book_count == 0)) {
            targetBook.setCount(book_count);
            System.out.println("수량 변경 완료\n");
        } else {
            bookArrayList.remove(targetBook);
            System.out.println("수량이 0개 이므로 장바구니에서 삭제 하였습니다. \n");
        }
        targetBook = null;
    }

    void menuCartRemoveItem(Scanner sc, ArrayList<Book> bookArrayList) {
        System.out.print("삭제할 책의 이름을 입력해주세요: ");
        book_name = sc.nextLine();

        for (Book book : bookArrayList) {
            if (book.getBook_name().equals(book_name)) {
                targetBook = book;
                break;
            }
        }

        if (targetBook == null) {
            System.out.println("장바구니에 책이 없습니다.");
            return;
        }

        System.out.printf("정말 %s 책을 장바구니에서 삭제하시겠습니까? (Y/N) : ", book_name);
        check = sc.nextLine().toUpperCase().charAt(0);
        if (check == 'Y') {
            bookArrayList.remove(targetBook);
            System.out.println("장바구니에서 제거 되었습니다. \n");
        }
    }

    void menuCartBill(Member member, ArrayList<Book> bookArrayList) {
        System.out.printf("%s님의 구매 목록", member.getName());
        System.out.println("==========================================");
        bookArrayList.forEach(book -> System.out.println(book));
        System.out.println("==========================================");
        System.out.printf("총 금액 : %s\n\n", bookArrayList.size() * 10000);
    }

}
