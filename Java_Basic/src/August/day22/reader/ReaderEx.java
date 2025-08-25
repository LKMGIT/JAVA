package August.day22.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        reader = new FileReader("C:/Temp/testChar.txt");

        // 1. 문자 하나씩 읽기
        while(true){
            int data = reader.read();
            if(data == -1){
                break;
            }
            System.out.println((char)data);
        }
        reader.close();
        System.out.println();

        // 2. 문자 배열로 읽기
        reader = new FileReader("C:/Temp/testChar.txt");
        char[] chars = new char[1024];

        while(true){
            int data = reader.read(chars);
            if(data == -1){
                break;
            }
            for(int i =0; i < data; i ++){
                System.out.println(chars[i]);
            }
        }
        reader.close();


        //

    }
}
