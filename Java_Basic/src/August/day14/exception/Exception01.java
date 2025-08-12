package August.day14.exception;

//컴파일 예외 클래스 종류와 처리
// 1. IOException : 입출력과 관련된
// 2. FIleNotFoundException : 파일에 접근하려고 하는데 지정 위치에 파일이 존재  X

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception01 {
    public static void main(String[] args) {
        byte[] list = {'a', 'b', 'c'};
//        try {
//            System.out.write(list);
//        }catch (IOException e){
//            e.getMessage();
//        }
//        throws  IOException
//        System.out.write(list);

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

    }
}
