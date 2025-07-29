package day05;

public class star_5 {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('_');
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
