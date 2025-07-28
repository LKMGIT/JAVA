package jungol.for_while_if_2;

import java.util.stream.IntStream;

public class q9048 {
    public static void main(String[] args) {
        IntStream is = IntStream.rangeClosed(1,20);
        is.filter(n -> n%2==1).forEach(e-> System.out.print(e + " "));
    }
}
