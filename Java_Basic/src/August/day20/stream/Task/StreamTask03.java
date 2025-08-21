package August.day20.stream.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask03 {
    public static void main(String[] args) {
        List<Member2> list = Arrays.asList(
                new Member2("홍길동","개발자"),
                new Member2("김나리","디자이너"),
                new Member2("신용권","개발자")
        );

        List<Member2> develpoers = list.stream()
                .filter(s -> s.getJob().contains("개발자")).collect(Collectors.toList());
        develpoers.stream().forEach(m -> System.out.println(m.getName()));


    }

}
