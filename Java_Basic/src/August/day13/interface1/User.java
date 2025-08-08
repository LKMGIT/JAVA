package August.day13.interface1;

public class User {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Televison();
        rc.trunOn();

        RemoteControl rc1 = new Vacuum();
        rc1.trunOn();
        ((Vacuum) rc1).run();
        rc1.trunOff();

        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        rc.setVolume(10);
        rc.setMute(true);
    }
}
