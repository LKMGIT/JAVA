package August.day20.stream.Task;

/*
1. 스트림에 대한 설명으로 틀린 것은 무엇입니까?
● 스트림은내부 반복자를 사용하기 때문에 코드가 간결해진다.
● 스트림은 요소를 분리해서 병렬 처리시킬 수 있다.
● 스트림은 람다식을 사용해서 요소 처리 내용을 기술한다.
● 스트림은 요소를 모두 처리하고 나서 처음부터 요소를 다시 반복시킬 수 있다. (X)

2. 스트림을 얻을 수 있는 소스가 아닌 것은 무엇입니까?
1. 컬렉션 (List)
2. int, long, double 범위 (X)
3. 디렉토리
4. 배열

3. 스트림 파이프라인에 대한 설명으로 틀린 것은 무엇입니까?
● 스트림을 연결해서 중간 처리와 최종 처리를 할 수 있다.
● 중간 처리 단계에서는 필터링, 매핑, 정렬, 그룹핑을 한다.
● 최종 처리 단계에서는 합계, 평균, 카운팅, 최대값, 최소값 등을 얻을 수 있다.
● 최종 처리가 없더라도 중간 처리를 할 수 있다. (X)

4. 스트림 병렬 처리에 대한설명으로 틀린 것은 무엇입니까?
● 전체 요소를 분할해서 처리한다.
● 내부적으로 포크조인 프레임워크를 이용한다.
● 병렬 처리는 순차적 처리보다 항상 빠른 처리를 한다. (X)
● 내부적으로 스레드풀을 이용해서 스레드를 관리한다.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTask01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);


    }
}
