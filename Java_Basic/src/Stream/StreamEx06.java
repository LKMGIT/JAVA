package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx06 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(80,90,100);

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);



    }
}
