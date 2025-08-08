package August.day13.interface1;

public class Televison implements RemoteControl{

    private int volume;
    private int memory_volume;

    @Override
    public void trunOn() {
        System.out.println("TV 전원을 켠다");
    }

    @Override
    public void trunOff() {
        System.out.println("TV 전원을 끈다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        if(mute){
            System.out.println("무음");
            this.memory_volume =volume;
            this.volume = MIN_VOLUME;
        }else{
            System.out.println("무음 해제");
            this.volume = this.memory_volume;

        }
    }


}
