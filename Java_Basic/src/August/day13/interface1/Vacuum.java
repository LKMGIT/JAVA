package August.day13.interface1;

public class Vacuum implements RemoteControl{
    
    private int volume;
    

    @Override
    public void trunOn() {
        System.out.println("청소기 전원을 켭니다.");
    }

    @Override
    public void trunOff() {
        System.out.println("청소기 전월을 끕니다.");
    }

    public void run(){
        System.out.println("청소기를 10분간 동작시킵니다.");
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
        System.out.println("현재 라디오 볼륨 : " + this.volume);
    }
}
