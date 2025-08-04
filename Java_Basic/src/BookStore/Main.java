package BookStore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart myCart = new Cart();
        ArrayList<Book> bookArrayList = new ArrayList<>();

        Input_Member input_member = new Input_Member();

        boolean loop = true;

        Member member = input_member.input_name_phone(sc);

        while (loop) {
            //화면
            Menu.print_screen();

            try {
                //사용자 입력
                int num = Menu.select_menu(sc);

                switch (num) {
                    case 1 -> input_member.menuGuestInfo(member);
                    case 2 -> myCart.menuCartItemList(bookArrayList);
                    case 3 -> myCart.menuCartClear(bookArrayList, sc);
                    case 4 -> myCart.menuCartAddItem(sc,bookArrayList);
                    case 5 -> myCart.menuCartRemoveItemCount(sc, bookArrayList);
                    case 6 -> myCart.menuCartRemoveItem(sc, bookArrayList);
                    case 7 -> myCart.menuCartBill(member,bookArrayList);
                    case 8 -> loop = Menu.menuExit(loop);
                }

            }catch (InputMismatchException e){
                System.out.println("올바른 입력을 하세요.");
                sc.nextLine();
            }catch (Exception e){
                System.out.println("오류 발생" +e.getMessage());
                sc.nextLine();
            }

        }
        System.out.println("이용해주셔서 감사합니다 :> b");
    }
}
