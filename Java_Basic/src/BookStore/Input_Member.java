package BookStore;

import BookStore.Entity.Member;

import java.util.Scanner;

public class Input_Member {

    //고객 정보 입력 메서드
    Member input_name_phone(Scanner sc) {
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        //사용자 전화번호 입력
        System.out.print("연락처를 입력하세요 : ");
        String phone_number = sc.nextLine();
        Member member = new Member(name, phone_number);
        return member;
    }

    //고객 정보 확인 메서드
    void menuGuestInfo(Member member) {
        System.out.println("현재 고객 정보 : ");
        System.out.printf("이름 : %4s 연락처 : %4s\n\n", member.getName(), member.getPhone_number());
    }

}
