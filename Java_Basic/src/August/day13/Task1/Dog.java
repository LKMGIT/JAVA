package August.day13.Task1;

public class Dog extends Animal{

    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.distance = 0;
        this.distance += this.speed * 0.5 * hours;
    }
}
