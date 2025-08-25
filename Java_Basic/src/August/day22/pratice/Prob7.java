package August.day22.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) throws Exception {

        InputStream in = new FileInputStream("C:/Temp/Racon2_copy.jpg");

        System.out.println(in.read());

    }
}
