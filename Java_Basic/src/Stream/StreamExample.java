package Stream;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김철수", "이영희", "박지성");

        List<String> result = names.stream()
                .filter(name ->name.startsWith("김"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}


