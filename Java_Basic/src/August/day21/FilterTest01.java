package August.day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "ALice", "Bab", "Canon", "David", "Eric"
        );

        //이름 중 "A"로 시작하는 이름을 수집하여 출력하세요
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        List<String> filter_name = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filter_name.toString());

        List<String> names2 = Arrays.asList(
                "ALice", "Bab", "Canon"
        );

        // 2번 각 이름의 길이를 세어서 출력하시오. 결과 : [5,3,5]

        names2.stream().mapToInt(name -> name.length()).forEach(System.out::println);

        List<Integer>length_name =  names2.stream().map(String::length).collect(Collectors.toList());
        System.out.println(length_name.toString());


    }
}
