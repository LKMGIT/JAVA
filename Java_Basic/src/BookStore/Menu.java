package BookStore;


import java.util.Scanner;

public class Menu {
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
                 9. 관리자 로그인
                *******************************************************""");
    }

    //메뉴 선택 메서드
    static int select_menu(Scanner sc) {
        // 사용자 메뉴 선택 옵션
        System.out.print("메뉴 번호를 선택해주세요 : ");
        int menu = sc.nextInt();
        sc.nextLine();
        return menu;
    }

    static boolean menuExit(boolean loop){
        loop = false;
        return loop;
    }

}