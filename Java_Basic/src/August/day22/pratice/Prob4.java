package August.day22.pratice;

import java.io.*;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) throws Exception {

        OutputStream out = new FileOutputStream("C:/Temp/byte_output.txt") {
        };

        byte[] buf = new byte[]{'A','B','C','D','E','F'};

        out.write(buf);


    }
}
