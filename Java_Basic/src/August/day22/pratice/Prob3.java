package August.day22.pratice;

import java.io.FileReader;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws Exception {
        int count = 0;

        Reader reader = new FileReader("C:/Temp/hello.txt");

        while (reader.ready()) {
            for(int i =0; i < reader.read(); i++) {
                count++;
            }
        }

        System.out.println(count);
        reader.close();

    }
}
