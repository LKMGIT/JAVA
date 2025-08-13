package August.day15.generic;

public class Box <T>{

    public T content;
    public Object cotent2; // 들어오는 값에 따라 설정

    public static void main(String[] args) {
        Box box = new Box();

        box.content = 100;
        box.content = "hello";

        box.cotent2 = 2.4;
        box.cotent2 = 'c';


        String str1 = (String) box.content;

    }

}
