package BookStore.service;

import BookStore.Entity.User;

public class UserImpl implements User_interface {

    User user;

    //고객 정보 입력 메서드
    public void login(String username, String phone_number) {
        user = new User(username, phone_number);
    }

    //고객 정보 확인 메서드
    public void menuGuestInfo() {
        System.out.println("현재 고객 정보 : ");
        System.out.printf("이름 : %4s 연락처 : %4s\n\n", user.getName(), user.getPhone_number());
    }

    public String returnName() {
        return user.getName();
    }

}
