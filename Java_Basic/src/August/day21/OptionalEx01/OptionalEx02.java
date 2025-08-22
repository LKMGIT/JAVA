package August.day21.OptionalEx01;

import java.util.Optional;

public class OptionalEx02 {

    public static void main(String[] args) {
        String str = "Hello Optional";

        Optional<String> optional = Optional.of(str);
        System.out.println(optional); // of 값이 null이 아닌경우에만 Optional 객체 생성

        String numStr = null;
        Optional<String> optNullStr = Optional.ofNullable(numStr);
        System.out.println(optNullStr);

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);




    }
}
