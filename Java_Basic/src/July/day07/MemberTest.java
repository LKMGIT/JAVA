package July.day07;

import java.util.ArrayList;

public class MemberTest {
    public static void main(String[] args) {
        // Member[] arr = new Member[5];
        // arr[0] = new Member(30, "홍길동", "010-1111-1111", "f2@naver.com","서울", 57.6);

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(30, "홍길동", "010-1111-1111", "f2@naver.com","서울", 57.6));

        for(Member m : members){
            System.out.println(m.toString());
        }


    }
}
