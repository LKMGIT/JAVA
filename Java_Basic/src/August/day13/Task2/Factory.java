package August.day13.Task2;

public abstract class Factory {

    int openHour;
    int closeHour;
    String name;

    public Factory(String name, int openHour, int closeHour) {
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.name = name;
    }

    public String getFactoryName() {
        return name;
    }

    public int getWorkingTime(){
        return this.closeHour - this.openHour;
    }

    public abstract int makeProducts(char skill);


}
