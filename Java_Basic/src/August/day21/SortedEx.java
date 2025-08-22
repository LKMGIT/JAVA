package August.day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class SortedEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "신세계", "정용진", "정현주", "남기주"
        );

        // 2. 자연순으로 정렬하여 출력하세요
        List<String> sorted_name1 = names.stream().sorted().toList();
        System.out.println(sorted_name1);

        sorted_name1.reversed(); //?
        List<String> sorted_name2 = names.stream().sorted(Comparator.reverseOrder()).toList();

        List<String> name2 = Arrays.asList(
                "Alice", "Bob", "Carl", "Dan", "Eve", "Adan"
        );

        //names 의리므 중 D 로 시작하는 이름을 대문자로 모두 바꾸어 자연 출력 정렬하여

        name2.stream().filter(name -> name.startsWith("D")).map(String::toUpperCase).sorted().forEach(System.out::println);
        // 스트림으로 만들고       거르고                              변경하고                   정렬하고       출력


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names3 = Arrays.asList("이경민", "이경민", "홍길동", "김동아", "호랑이", "기타등등");

        // 1. 정수 리스트에서 짝수를 필터링 하는 자바 스트림 연산 작성
        List<Integer> even = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println(even);

        // 2. 리스트의 각 정수를 제곱하기 위해 map 연산을 사용하여 연산 결과를 출력
        List<Integer> sqrt = numbers.stream().map(number -> number * number).toList();
        System.out.println(sqrt);

        // 3. 문자열 리스트에서 중복 요소를 제거하기 위해 distinct 연산을 사용하여 결과를 출력
        List<String> distinct_list = names3.stream().distinct().toList();
        System.out.println(distinct_list);

        // 4. 스트림을 사용하여 정수 리스트를 오름차순을 출력하세요.
        List<Integer> sort_lsit = numbers.stream().sorted().toList();
        System.out.println(sort_lsit );

        // 5. 정수리스트에서 리스트의 모든 짝수의 합을 구하여 출력
        int sum = numbers.stream().mapToInt(number -> number).sum();
        System.out.println(sum);


    }
}
