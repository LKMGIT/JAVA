package BookStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static boolean loop = true; // 반복문 제어 변수
    static char check = ' ';
    static String book_name = " ";
    static int book_count = 0;
    static Book targetBook = null;

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> bookArrayList = new ArrayList<>();

    //고객 정보 입력 메서드
    static Member input_name_phone() {
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        //사용자 전화번호 입력
        System.out.print("연락처를 입력하세요 : ");
        String phone_number = sc.nextLine();
        Member member = new Member(name, phone_number);
        return member;
    }

    //고객 정보 확인 메서드
    static void menuGuestInfo(Member member) {
        System.out.println("현재 고객 정보 : ");
        System.out.printf("이름 : %4s 연락처 : %4s\n\n", member.getName(), member.getPhone_number());
    }

    //화면 출력 메서드
    static void print_screen() {
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
                
                *******************************************************""");
    }

    //메뉴 선택 메서드
    static int select_menu() {
        // 사용자 메뉴 선택 옵션
        System.out.print("메뉴 번호를 선택해주세요 : ");
        int menu = sc.nextInt();
        sc.nextLine();
        return menu;
    }

    //바구니 항목 추가 메서드
    static void menuCartAddItem() {
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
    static void menuCartItemList(){
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
    static void menuCartClear() {
        System.out.print("장바구니를 정말 비우시겠습니까? (Y/N) : ");
        check = sc.nextLine().toUpperCase().charAt(0);

        if (check == 'Y') {
            bookArrayList.clear();
            System.out.println("장바구니를 비웠습니다. \n");
        } else {
            System.out.println("장바구니 비우기를 취소했습니다. \n");
        }
    }

    static void menuCartRemoveItemCount(){
        System.out.print("수량을 줄일 책의 이름을 입력해주세요: ");
        book_name = sc.nextLine();

        for(Book book : bookArrayList){
            if(book.getBook_name().equals(book_name)){
                targetBook = book;
                break;
            }
        }

        if(targetBook == null){
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

    static void menuCartRemoveItem(){
        System.out.print("삭제할 책의 이름을 입력해주세요: ");
        book_name = sc.nextLine();

        for(Book book : bookArrayList){
            if(book.getBook_name().equals(book_name)){
                targetBook = book;
                break;
            }
        }

        if(targetBook == null){
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

    static void menuCartBill(Member member){
        System.out.printf("%s님의 구매 목록" ,member.getName());
        System.out.println("==========================================");
        bookArrayList.forEach(book -> System.out.println(book));
        System.out.println("==========================================");
        System.out.printf("총 금액 : %s\n\n", bookArrayList.size() * 10000);
    }

    static void menuExit(){
        loop = false;
    }

    public static void main(String[] args) {

        Member member = input_name_phone();
        while (loop) {
            //화면
            print_screen();
            
            //사용자 입력
            int num = select_menu();

            switch (num) {
                case 1 -> menuGuestInfo(member);
                case 2 -> menuCartItemList();
                case 3 -> menuCartClear();
                case 4 -> menuCartAddItem();
                case 5 -> menuCartRemoveItemCount();
                case 6 -> menuCartRemoveItem();
                case 7 -> menuCartBill(member);
                case 8 ->menuExit();
            }
        }
        System.out.println("이용해주셔서 감사합니다 :> b");
    }
}