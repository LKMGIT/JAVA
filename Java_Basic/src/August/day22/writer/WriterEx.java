package August.day22.writer;

import java.io.FileWriter;
import java.io.Writer;

//Writer 클래스는 OutputStream 과 사용법은 동일 하지만, 출력 단위가 문자(char)이다.
//문자열을 출력하는 write(String str) 메소드가 추가 제공
public class WriterEx {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/testChar.txt");

        char ch1 = 'A';
        writer.write(ch1);

        char ch2 = 'B';
        writer.write(ch2);

        // char 배열 파일 출력
        char[] chars = {'C', 'D','E','F'};
        writer.write(chars);

        //문자열 파일 출력
        String str = "Hello World";
        writer.write(str);


        writer.flush();
        writer.close();

    }

}
