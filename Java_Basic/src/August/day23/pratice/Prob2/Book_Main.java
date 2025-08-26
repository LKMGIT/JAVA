package August.day23.pratice.Prob2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Book_Main {
    public static void main(String[] args) throws Exception {
        List<Book> books = new ArrayList<Book>();
        String path = "C:/Temp/books.dat";

        books.add(new Book("그림으로 배우는 JavaBasic", 15000));
        books.add(new Book("그림으로 배우는 SQL 입문", 10000));
        books.add(new Book("HTML, CSS, 자바스크립트", 13000));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        oos.writeObject(books);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        try {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("파일 끝");
        } finally {
            ois.close();
        }
    }
}
