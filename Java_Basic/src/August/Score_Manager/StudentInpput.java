package August.Score_Manager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentInpput {
    public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    }


    public static void screen(){
        System.out.println("""
                [학생 성적 입력 프로그램]
                - 종료하려면 이름에 ^^를 입력하세요.
                - 점수는 0~100 사이의 정수만 허용됩니다.
                """);
    }

}
