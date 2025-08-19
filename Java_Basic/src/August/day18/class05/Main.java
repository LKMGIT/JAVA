package August.day18.class05;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator calculator = new Calculator(num1, num2);

        Operate operate = (n1, n2) -> n1 + n2;

        int result = calculator.calculate(operate);


    }
}
