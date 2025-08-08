package August.day13.interface1;

public interface RemoteControl {

    public static final int MAX_VOLUME = 30;
    public static final int MIN_VOLUME = 0;

    public void trunOn();
    public void trunOff();
    public void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리");
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제");
        }
    }

    static void changeBattety(){
        System.out.println("리모컨 건전지 교환합니다.");
    }

    private void coolDown(){

    }
    
}
