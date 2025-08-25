package August.day22.pratice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) throws IOException {

        InputStream reader = new FileInputStream("C:/Temp/Racon.jpg");
        OutputStream out = new FileOutputStream("C:/Temp/Racon2_copy.jpg");

        reader.transferTo(out);

    }
}
