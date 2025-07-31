package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {

        List<Integer> num_list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = num_list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
