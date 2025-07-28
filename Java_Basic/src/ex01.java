public class ex01 { // public은 class ex01 {} 이라는 클래스는 누구나 접근할 수 있는 public 클래스이다. (접근제한자)
                    // 접근 제한자는 public, protect, default, private  4가지 종류가 존재한다.
                    // public은 아무나 접근이 가능하고
                    // protect는 허용 된 애들만 접근이 가능하고
                    // private는 접근이 불가능하다. 하지만 접근자를 사용하면 사용할 수 있다.
                    // default는 기본? 접근 제어자이다.

    public static void main(String[] args) { // main 메서드. 메서드란? -> 기능단위라고 생각.
        //메서드 수행 -> 저장 공간을 할당 하고 저장공간을 읽어와서 CPU가 연산을 하고 레지스터에 보내고 그걸 다시 저장공간에 저장

        // ===========Quiz ===========
        // 3개의 정수를 10, 11, 12를 더하여 결과를 출력하세요

        int a; int b; int c; int sum;    // 내가 사용할 변수를 먼저 선언 해주는 게 좋음

        a = 10; b = 11; c = 12;  // 그 후에 변수에 초기값을 설정해주는게 좋다.

        sum = a + b + c;
        System.out.println("10 + 11 + 12" + " = " + sum); // Ctrl + D 누르면 한줄 복사
        System.out.println(a + " + " + b + " + " + c + " = " + sum);

        System.out.println("hello");

        System.out.printf("%d + %d + %d = %d", a, b, c ,sum); //스트링 포멧
        // %d -> 정수, %lf <- 실수, %s <- 문자열, %c <- 문자


    }


}
