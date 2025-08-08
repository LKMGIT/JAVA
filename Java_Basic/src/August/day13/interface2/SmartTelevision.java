package August.day13.interface2;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void trunOn() {
        System.out.println("TV 전원 켜기");
    }

    @Override
    public void trunOff() {
        System.out.println("TV 전원 끄기");
    }

    @Override
    public void search(String Url) {
        System.out.println(Url + "검색합니다.");
    }
}
