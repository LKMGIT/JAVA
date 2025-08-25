package BookStore.service;

import BookStore.Entity.Book;
import BookStore.Entity.CartItem;

import java.util.ArrayList;
import java.util.List;

public class CartImpl implements Cart_interface{

    CartItem targetBook = null;
    List<CartItem> carts = new ArrayList<>();

    //바구니 항목 추가 메서드
    public void menuCartAddItem(CartItem cartItem) {
        carts.add(cartItem);
    }

    //장바구니 상품 목록 확인 메서드
    public void menuCartItemList() {
        //장바구니 상품 목록 확인 부분
        //장바구니가 비어있지 않으면 현재 장바구니 상태 출력
        if (!carts.isEmpty()) {
            System.out.println("======현재 고객님의 장바구니 상품 목록======");
            carts.forEach(book -> System.out.println(book));
        } else {
            //장바구니가 비어 있으면 장바구니가 비어 있다고 알림
            System.out.println("현재 장바구니가 비어있습니다.\n");
        }
    }

    //장바구니 비우기 메서드
    public void menuCartClear() {
        carts.clear();
    }

    public void menuCartRemoveItemCount(String book_name, int book_count) {
        for (CartItem cart : carts) {
            if (cart.getBook_name().equals(book_name)) {
                targetBook = cart;
                break;
            }
        }
        targetBook.setBook_count(book_count);
    }

    public void menuCartRemoveItem(String book_name) {
        for (CartItem cart : carts) {
            if (cart.getBook_name().equals(book_name)) {
                targetBook = cart;
                break;
            }
        }
        carts.remove(targetBook);
    }

    public void menuCartBill(UserImpl userimpl) {
        System.out.printf("%s님의 구매 목록", userimpl.returnName());
        System.out.println("==========================================");
        carts.forEach(book -> System.out.println(book));
        System.out.println("==========================================");
        System.out.printf("총 금액 : %s\n\n", carts.size() * 10000);
    }

}
