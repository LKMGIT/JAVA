package August.day13.Task2;

public class CarFactory extends Factory implements IWorkingTogether{

    public CarFactory( String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        if(skill == 'A'){
            return this.getWorkingTime() * 3;
        }else if (skill == 'B'){
            return this.getWorkingTime() * 2;
        }else if(skill == 'C'){
            return this.getWorkingTime();
        }else
            return 0;
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        if (partner instanceof CarFactory carFactory){
            return carFactory.makeProducts('B');
        }else{
            return 0;
        }

       //  return ((CarFactory)partner).makeProducts('B');
    }
}
