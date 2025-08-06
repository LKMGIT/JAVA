package August.day11.Inheritance_3;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String s[]){
        Scanner keyboard = new Scanner(System.in);

        Rectangle rec1 = new Rectangle();
        System.out.println("첫번째 직사각형의 색깔: ");
        rec1.setColor(keyboard.next());
        System.out.println("첫번째 직사각형의 가로: ");
        rec1.setWidth(keyboard.nextInt());
        System.out.println("첫번째 직사각형의 세로: ");
        rec1.setHeight(keyboard.nextInt());

        Rectangle rec2 = new Rectangle();
        System.out.println("두번째 직사각형의 색깔: ");
        rec2.setColor(keyboard.next());
        System.out.println("두번째 직사각형의 가로: ");
        rec2.setWidth(keyboard.nextInt());
        System.out.println("두번째 직사각형의 세로: ");
        rec2.setHeight(keyboard.nextInt());

        System.out.println(rec1.getColor() + " 직사각형의 넓이는 " + rec1.calculateArea() + "이고 둘레는 " + rec1.perimeter() + "입니다.");
        System.out.println(rec2.getColor() + " 직사각형의 넓이는 " + rec2.calculateArea() + "이고 둘레는 " + rec2.perimeter() + "입니다.");

        // TODO 1) 두 직사각형의 넓이를 비교하십시오.
        if(rec1.compareArea(rec2) == 1){
            System.out.println("넓이는 " +rec1.getColor() + " 직사각형이 더 큽니다.");
        } else if (rec1.compareArea(rec2)== 0) {
            System.out.println("넓이는 같습니다.");
        }else{
            System.out.println("넓이는 " +rec2.getColor() + " 직사각형이 더 큽니다.");
        }

        // TODO 2) 두 직사각형의 둘레를 비교하십시오.
        if(rec1.comparePerimeter(rec2) == 1){
            System.out.println("둘레는 " +rec1.getColor() + " 직사각형이 더 깁니다.");
        } else if (rec1.comparePerimeter(rec2)== 0) {
            System.out.println("둘레는 같습니다.");
        }else{
            System.out.println("둘레는 " +rec2.getColor() + " 직사각형이 더 깁니다.");
        }
    }
}
