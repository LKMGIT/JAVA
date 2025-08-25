package August.day22.pratice;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) throws Exception {

        InputStream in = Files.newInputStream(Paths.get("C:/Temp/byte_output.txt"));

        byte[] buf = new byte[1024];

        while (true) {

            int data = in.read(buf);   //최대 100btye를 읽고 읽은 바이트는 array저장, 읽은 바이트 수 만큼 정수값 리턴
            //파일은 끝이 있다. EOF (End of File) => -1
            if (data == -1) break;

            for (int i = 0; i < data; i++) {
                System.out.print((char)buf[i]);
            }

        }
    }

}
