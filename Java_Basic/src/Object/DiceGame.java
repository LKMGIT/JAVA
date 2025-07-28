package Object;

import java.util.Random;

class Dice {

    int Dice_Num;

    public int roll_dice() {
        Random r = new Random();

        return r.nextInt(6) + 1;   //1 ~ 6까지 굴리기
    }

}

public class DiceGame {
    public static void main(String[] args) {

        int count = 0;
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        while (true) {
            int num1 = d1.roll_dice();
            int num2 = d2.roll_dice();
            count++;
            if (num1 + num2 == 6) {
                break;
            }
        }

        System.out.println("합 6이 나올 때 까지 걸린 횟수 : " + count);

    }
}
