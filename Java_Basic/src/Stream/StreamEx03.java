package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx03 {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("apple", "banana", "apple", "kiwi");

        long count = word.stream()
                .filter(a -> a.equals("apple"))
                .count();

        System.out.println(count);

        word = word.stream().distinct().collect(Collectors.toUnmodifiableList());

        count = word.stream().filter(a -> a.equals("apple")).count();

        System.out.println(count);

    }

}
