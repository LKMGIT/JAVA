package August.day21;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx01 {
    public static void main(String[] args) {
        List<List<String>> listOflist = Arrays.asList(
            Arrays.asList("A"),
            Arrays.asList("B","C"),
            Arrays.asList("d","e"),
            Arrays.asList("f","g"),
            Arrays.asList("h","i")
        );

        List<String> allNames = listOflist.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


        System.out.println(allNames);

    }
}
