package August.day12.Task03;

public abstract class Wheeler {

    protected int velocity;

    protected String carName;

    protected int wheelNumber;

    public Wheeler(int velocity, String carName) {
        this.velocity = velocity;
        this.carName = carName;
    }

    public abstract void speedUp(int speed);

    public abstract void speedDown(int speed);

    public abstract void stop();
}
