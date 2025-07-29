package day05;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Menu {

    static String name = "";   //사용자 이름 저장 변수
    static String phone_number = ""; //사용자 번호 저장

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> book_list = new LinkedHashMap<>(); // 사용자 장바구니 (책이름, 수량)

        DecimalFormat formatter = new DecimalFormat("###,###");

        String book_name;  // 책 이름
        int book_count;   // 책 수량
        char check;     // 사용자 재확인
        boolean loop = true;    // 반복문 제어

        // 사용자 이름 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        name = sc.nextLine();

        //사용자 전화번호 입력
        System.out.print("연락처를 입력하세요 : ");
        phone_number = sc.nextLine();

        while (loop) {
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

            // 사용자 메뉴 선택 옵션
            System.out.print("메뉴 번호를 선택해주세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            //사용자 메뉴 swtich로 분리
            switch (menu) {
                //고객 정보 확인 부분
                case 1:
                    System.out.println("현재 고객 정보 : ");
                    System.out.printf("이름 : %4s 연락처 : %4s\n\n", name, phone_number);
                    break;

                case 2:
                    //장바구니 상품 목록 확인 부분
                    //장바구니가 비어있지 않으면 현재 장바구니 상태 출력
                    if (!book_list.isEmpty()) {
                        System.out.println("======현재 고객님의 장바구니 상품 목록======");
                        book_list.forEach((key, value) -> {
                            System.out.println("책 이름: " + key + ", 수량: " + value);
                        });
                    } else {
                        //장바구니가 비어 있으면 장바구니가 비어 있다고 알림
                        System.out.println("현재 장바구니가 비어있습니다.\n");
                    }
                    break;

                //장바구니 비우는 부분
                case 3:
                    //장바구니 비우는지 확인
                    System.out.print("장바구니를 정말 비우시겠습니까? (Y/N) : ");
                    check = sc.nextLine().toUpperCase().charAt(0);
                    //Y 입력 시 list clear
                    if (check == 'Y') {
                        book_list.clear();
                        System.out.println("장바구니를 비웠습니다. \n");
                    }
                    break;

                //장바구니에 책 추가 (일단 1개)
                case 4:
                    System.out.print("장바구니에 추가할 책 이름을 입력해주세요: ");
                    book_name = sc.nextLine();
                    System.out.print("책의 수량을 입력해주세요: ");
                    book_count = sc.nextInt();
                    sc.nextLine();
                    book_list.put(book_name, book_count);
                    System.out.printf("장바구니에 %s 책을 %d개 추가하였습니다. \n\n", book_name, book_count);
                    break;

                //장바구니에 담긴 책 수량 변경
                case 5:
                    System.out.print("수량을 줄일 책의 이름을 입력해주세요: ");
                    book_name = sc.nextLine();
                    System.out.print("수량을 몇개로 변경하시겠습니까?(0개 : 삭제): ");
                    book_count = sc.nextInt();
                    sc.nextLine();
                    //기존 값에 덮어쓰기
                    if (!(book_count == 0)) {
                        book_list.put(book_name, book_count);
                        System.out.println("수량 변경 완료\n");
                    } else {
                        book_list.remove(book_name);
                        System.out.println("수량이 0개 이므로 장바구니에서 삭제 하였습니다. \n");
                    }
                    break;

                //장바구니 목록 삭제 부분
                case 6:
                    System.out.print("삭제할 책의 이름을 입력해주세요: ");
                    book_name = sc.nextLine();
                    System.out.printf("정말 %s 책을 장바구니에서 삭제하시겠습니까? (Y/N) : ", book_name);
                    check = sc.nextLine().toUpperCase().charAt(0);
                    if (check == 'Y') {
                        book_list.remove(book_name);
                        System.out.println("장바구니에서 제거 되었습니다. \n");
                    }
                    break;

                //영수증 출력 부분
                case 7:
                    System.out.println("%s님의 구매 목록");
                    System.out.println("==========================================");
                    book_list.forEach((key, value) -> {
                        System.out.println("책 이름: " + key + ", 수량: " + value);
                    });
                    System.out.println("==========================================");
                    System.out.printf("총 금액 : %s\n\n", formatter.format(book_list.size() * 10000));
                    break;

                //종료 부분
                case 8:
                    loop = false;
                    break;
            }
        }

        System.out.println("이용해주셔서 감사합니다 :> b");

    }
}
