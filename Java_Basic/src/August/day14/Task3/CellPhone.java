package August.day14.Task3;

public class CellPhone {

    String model;
    double battery;


    public CellPhone(String model) {
        this.model = model;
    }

    public void call(int time) throws IllegalArgumentException {
        if (time < 0)
            throw new IllegalArgumentException("통화시간 입력 오류");
        else {
            this.battery = this.battery - time * 0.5;
            if (this.battery < 0) {
                this.battery = 0;
            }
            System.out.println("통화시간 : " + time + "분");
        }
    }

    public void charge(int time) throws IllegalArgumentException {
        if (time < 0)
            throw new IllegalArgumentException("충전 시간 입력 오류");
        else {
            this.battery = this.battery + time * 3;
            System.out.println("충전 시간 : " + time + "분");
        }
    }

    public void printBattery() {
        System.out.println("베터리는 : " + this.battery);
    }


}
