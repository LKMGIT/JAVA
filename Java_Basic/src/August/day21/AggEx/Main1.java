package August.day21.AggEx;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class Student{
    private String name;
    private int score;
}

public class Main1 {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
          new Student("Alice", 92),
          new Student("David", 95),
          new Student("Bob", 92)
        );
        //합계

        int sum = list.stream().mapToInt(Student::getScore).reduce(0, Integer::sum);
        System.out.println(sum);

        List<Student> list2 = Arrays.asList();

        int sum2 = list2.stream().mapToInt(Student::getScore).reduce(0, Integer::sum);
        System.out.println(sum2);

    }


}
