package August.day09;

import java.util.Scanner;

public class example05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("사용자 아이디 입력");
        String id = sc.nextLine();
        System.out.println("비밀번호 입력");
        String pwd = sc.nextLine();

        idPwPrint(id, pwd);

    }

    static void idPwPrint(String id, String pwd){
        System.out.println("id :" + id + "pwd : " + pwd);
    }

}
