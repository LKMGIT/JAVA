package Object;

class Car {

    String color;
    int gear;
    int speed;

    public String toString() {
        return "Car [color = " + color + "gear = " + gear + "speed = " + speed + "]";
    }


    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUP() {
        speed += 10;
    }



    public void speedDown() {
        speed -= 10;
    }



}

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car();

        c.changeGear(3);
        c.speedUP();
        System.out.println(c);

    }
}
