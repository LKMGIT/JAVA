package August.day13.Task2;

public class TVFactory extends Factory implements IWorkingTogether{
    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        if(skill == 'A'){
            return this.getWorkingTime() * 8;
        }else if (skill == 'B'){
            return this.getWorkingTime() * 5;
        }else if(skill == 'C'){
            return this.getWorkingTime() * 3;
        }else
            return getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        if (partner instanceof TVFactory tvFactory){
            return tvFactory.makeProducts('C');
        }else{
            return 0;
        }

        //  return ((TVFactory)partner).makeProducts('C');
    }
}
