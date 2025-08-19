package August.day18.class04;

public class Calculator {
    private final int number1;
    private final int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int calculate(Operate op) {
        return op.operate(number1, number2);
    }
}
