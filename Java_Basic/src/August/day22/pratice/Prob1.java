package August.day22.pratice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
public class Prob1 {

    public static void main(String[] args) throws Exception {
        Writer  writer = new FileWriter("C:/Temp/hello.txt");

        String str = "Hello World";

        writer.write(str);
        writer.flush();
        writer.close();
    }
}
