package August.day13.interface2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class User1 {
    public static void main(String[] args) {
        RemoteControl re = new SmartTelevision();

        re.trunOn();
        re.trunOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");


    }
}
