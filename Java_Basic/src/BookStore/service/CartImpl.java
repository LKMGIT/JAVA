package BookStore.service;

import BookStore.Entity.Book;
import BookStore.Entity.CartItem;

import java.util.ArrayList;
import java.util.List;
/*
public class CartImpl implements Cart_interface{

    Book targetBook = null;
    List<CartItem> carts = new ArrayList<>();

    //바구니 항목 추가 메서드
    public void menuCartAddItem(Book book) {
        books.add(book);
    }

    //장바구니 상품 목록 확인 메서드
    public void menuCartItemList() {
        //장바구니 상품 목록 확인 부분
        //장바구니가 비어있지 않으면 현재 장바구니 상태 출력
        if (!books.isEmpty()) {
            System.out.println("======현재 고객님의 장바구니 상품 목록======");
            books.forEach(book -> System.out.println(book));
        } else {
            //장바구니가 비어 있으면 장바구니가 비어 있다고 알림
            System.out.println("현재 장바구니가 비어있습니다.\n");
        }
    }

    //장바구니 비우기 메서드
    public void menuCartClear() {
        books.clear();
    }

    public void menuCartRemoveItemCount(String book_name, int book_count) {
        for (Book book : books) {
            if (book.getBook_name().equals(book_name)) {
                targetBook = book;
                break;
            }
        }
        targetBook.setCount(book_count);
    }

    public void menuCartRemoveItem(String book_name) {
        for (Book book : books) {
            if (book.getBook_name().equals(book_name)) {
                targetBook = book;
                break;
            }
        }
        books.remove(targetBook);
    }

    public void menuCartBill(UserImpl userimpl) {
        System.out.printf("%s님의 구매 목록", userimpl.returnName());
        System.out.println("==========================================");
        books.forEach(book -> System.out.println(book));
        System.out.println("==========================================");
        System.out.printf("총 금액 : %s\n\n", books.size() * 10000);
    }

}
*/