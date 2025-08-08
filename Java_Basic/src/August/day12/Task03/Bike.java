package August.day12.Task03;

public class Bike extends Wheeler{


    public Bike(String carName, int velocity, int wheelNumber) {
        super(velocity, carName);
        this.wheelNumber = wheelNumber;
    }

    public Bike(int velocity, String carName) {
        super(velocity, carName);
    }

    @Override
    public void speedUp(int speed) {
        this.velocity += speed;
        if(velocity > 40){
            this.velocity = 40;
            System.out.println("자전거의 최고 속도 위반으로 속도를 40으로 낮춥니다.");
        }
    }

    public void speedDown(int speed) {
        this.velocity -= speed;
        if(velocity < 10){
            this.velocity = 10;
            System.out.println("자전거의 최저속도 위반으로 속도를 10으로 올입니다.");
        }
    }

    @Override
    public void stop() {
        System.out.println("정지 상태로 속도를 0으로 초기화합니다.");
        this.velocity = 0;
    }
}
