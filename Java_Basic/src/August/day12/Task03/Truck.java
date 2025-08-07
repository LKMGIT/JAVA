package August.day12.Task03;

public class Truck extends Wheeler{

    public int wheelNumber;

    public Truck(int velocity, String carName) {
        super(velocity, carName);
    }

    public Truck(String carName, int velocity, int wheelNumber) {
        super(velocity, carName);
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity += speed*5;
        if(velocity > 100){
            this.velocity = 100;
            System.out.println("트럭의 최고 속도 위반으로 속도를 100으로 낮춥니다.");
        }
    }

    public void speedDown(int speed) {
        this.velocity -= speed*5;
        if(velocity < 50){
            this.velocity = 50;
            System.out.println("트럭의 최저속도 위반으로 속도를 50으로 올입니다.");
        }
    }

    @Override
    public void stop() {
        System.out.println("정지 상태로 속도를 0으로 초기화합니다.");
        this.velocity = 0;
    }
}
