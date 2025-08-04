package August.day09;

public class Computer {
    int sum = 0;

    public int totalSum(int ... arr) {

        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

}
