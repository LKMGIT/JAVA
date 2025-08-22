package August.day21;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class MappingEx01 {

    public static void main(String[] args) {
        //학생 3명을 리스트 컬렉션을 생성하여 순서대로 저장
        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 90));
        students.add(new Student("이경민", 85));
        students.add(new Student("홍인식", 90));


        //학생의 점수를 stream을 이용하여 출력하세요

        students.stream().map(student -> student.getScore()).forEach(System.out::println);

        // 학생들의 총점 출력
        int sumscore = students.stream().mapToInt(Student::getScore).sum();
        System.out.println(sumscore);

        double avg = students.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.printf("%.1f", avg);

    }
}
