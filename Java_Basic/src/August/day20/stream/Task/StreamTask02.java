package August.day20.stream.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTask02 {
    public static void main(String[] args) {
        List<Member> lists = Arrays.asList(
                new Member("홍길동", 30),
                new Member("홍길동", 40),
                new Member("홍길동", 26)

        );

        double avg = lists.stream().mapToInt(s -> s.getAge()).average().getAsDouble();
        System.out.println(avg);


    }
}
