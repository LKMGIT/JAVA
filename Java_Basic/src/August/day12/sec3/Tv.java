package August.day12.sec3;

public class Tv {
    String color;
    boolean power;
    int channel;

    public Tv(String color, boolean power, int channel) {
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    public void power(){
        this.power = !this.power;
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        this.channel--;
    }

    public void print(){
        System.out.println("color : " + this.color + "    power : " + this.power + "    channel : " + this.channel);
    }

}
