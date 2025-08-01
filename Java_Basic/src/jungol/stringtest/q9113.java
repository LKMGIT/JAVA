package jungol.stringtest;

import java.io.UnsupportedEncodingException;

public class q9113 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "우리나라 대한민국!";

        System.out.println(str);
        System.out.printf("위 문자열의 길이는 %d입니다.", str.getBytes("UTF-8").length);
    }
}
