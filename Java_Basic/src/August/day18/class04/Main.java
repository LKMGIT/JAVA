package August.day18.class04;

public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        Calculator calculator = new Calculator(number1, number2);

        int result = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });

    }
}
