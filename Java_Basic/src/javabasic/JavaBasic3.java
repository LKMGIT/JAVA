package javabasic;

public class JavaBasic3 {


    public static void main(String[] args) {

        int d1, d2;
        boolean roll = true;

        while(roll){

            d1 = (int) (Math.random()*6)+1;
            d2 = (int) (Math.random()*6)+1;

            if(d1 + d2 == 5){
                System.out.printf("d1 : %d d2 : %d", d1, d2);
                roll = false;
            }

        }


    }
}
