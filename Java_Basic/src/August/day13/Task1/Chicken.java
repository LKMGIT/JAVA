package August.day13.Task1;

public class Chicken extends Animal implements Cheatable{

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.distance = 0;
        this.distance += speed * hours;
    }

    @Override
    public void fly() {
        this.speed = this.speed * 2;
    }
}
