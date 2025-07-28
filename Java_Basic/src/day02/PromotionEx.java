package day02;

public class PromotionEx {
    public static void main(String[] args) {

        byte byteValue = 10;
        int intValue = byteValue;

        System.out.println(byteValue);
        System.out.println(intValue);

        long longValue = 500000L;
        double doubleValue = longValue;

        System.out.println(longValue);
        System.out.println(doubleValue);

        //리터럴 표시 e  5e2 -> 5 * 10 * 10  5e-2 -> 5 * 0.01

        double d1 = 5e2;
        double d2 = 5e-2;
        double d3 = 3.14;
        double d4 = 314e-2;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        float f1 = 3.14f;
        float f2 = 3e6f;

        System.out.println(f1);
        System.out.println(f2);

    }
}
