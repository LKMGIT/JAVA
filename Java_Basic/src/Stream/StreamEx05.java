package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class Member{
    String name;
    String email;

    public Member(String name, String email){
        this.name = name;
        this.email = email;
    }

}


public class StreamEx05 {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("홍길동", "hong@gmail.com"),
                new Member("김철수", "kim@naver.com"),
                new Member("이영희", "lee@gmail.com")
        );

        members.stream()
                .filter(m -> m.email.endsWith("gmail.com"))
                .map(m -> m.name)
                .forEach(System.out::println);


    }
}
