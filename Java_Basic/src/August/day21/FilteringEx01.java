package August.day21;

import java.util.ArrayList;
import java.util.List;

public class FilteringEx01 {
    public static void main(String[] args) {
        //List 컬레레ㅔㄱ션 ArrayList 생성
        //List 5명의 이름을 저장하세요.

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("A");

        list.add("B");
        list.add("B");
        list.add("E");

        list.stream().forEach(System.out::println);

        System.out.println();

    }
}
