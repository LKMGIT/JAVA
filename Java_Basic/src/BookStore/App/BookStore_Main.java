package BookStore.App;
/*
import BookStore.service.CartImpl;
import BookStore.Entity.Book;
import BookStore.service.UserImpl;

import java.util.Scanner;

public class BookStore_Main {

    Scanner sc = new Scanner(System.in);
    CartImpl myCartImpl = new CartImpl();
    UserImpl myUserImpl = new UserImpl();

    String name;
    String phone_number;
    String book_name;
    int book_count;
    boolean flag = true;

    public void run() {
        // 사용자 이름, 전화번호 입력
        System.out.print("이름을 입력하세요: ");
        name = sc.nextLine();
        System.out.print("전화 번호를 입력하세요");
        phone_number = sc.nextLine();
        myUserImpl.login(name, phone_number);

        while (flag) {
            //메뉴 바 출력
            System.out.println("""
                    =======================================================
                                   Welcome to Shopping Mall
                                   Welcome to Book Market!
                    =======================================================
                    *******************************************************
                    
                     1. 고객 정보 확인하기         4. 바구니에 항목 추가하기
                     2. 장바구니 상품 목록 보기     5. 장바구니의 항목 수량 줄이기
                     3. 장바구니 비우기            6. 장바구니 항목 삭제하기
                     7. 영수증 표시하기            8. 종료
                     9. 관리자 로그인
                    *******************************************************""");
            System.out.print("메뉴 번호를 선택해주세요 : ");
            int num = sc.nextInt();
            sc.nextLine();

            //입력한 메뉴에 따라 분기
            switch (num) {
                case 1:
                    myUserImpl.menuGuestInfo();
                    break;
                case 2:
                    myCartImpl.menuCartItemList();
                    break;
                case 3:
                    myCartImpl.menuCartClear();
                    break;
                case 4:
                    System.out.print("추가할 책의 제목:");
                    book_name = sc.nextLine();
                    System.out.print("추가할 수량");
                    book_count = sc.nextInt();
                    sc.nextLine();
                    Book book = new Book(book_name, book_count);
                    myCartImpl.menuCartAddItem(book);
                    break;
                case 5:
                    System.out.print("수량 줄일 책의 제목:");
                    book_name = sc.nextLine();
                    System.out.println("변경할 수량: ");
                    book_count = sc.nextInt();
                    sc.nextLine();
                    myCartImpl.menuCartRemoveItemCount(book_name, book_count);
                    break;
                case 6:
                    System.out.println("삭제할 책의 제목: ");
                    book_name = sc.nextLine();
                    myCartImpl.menuCartRemoveItem(book_name);
                    break;
                case 7:
                    myCartImpl.menuCartBill(myUserImpl);
                    break;
                case 8:
                    flag = false;
                    break;

            }

        }
    }

}
*/