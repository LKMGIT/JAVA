package August.day23.pratice.Prob1;

import java.io.*;

public class Person_Main {
    public static void main(String[] args) throws Exception {
        Person p = new Person("홍길동", 30);
        String path = "C:/Temp/person.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(p);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        try {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        }catch (EOFException e){
            System.out.println("파일 끝");
        }finally {
            ois.close();
        }
    }
}
