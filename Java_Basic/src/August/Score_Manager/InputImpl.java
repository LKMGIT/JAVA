package August.Score_Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InputImpl implements InputInterface {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Student> studentInfo = new HashMap<>();
    File file = new File("C:/Temp/student.dat");
    List<Student> students = new ArrayList<>();

    // 사용자 정보 입력 후 Map에 저장, 화면에 출력
    public void checkKeyAndInputData() throws IOException {
        while (true) {
            Student student = new Student();

            System.out.print("이름: ");
            String name = br.readLine();
            if (studentInfo.containsKey(name)) {
                System.out.println("이름이 중복입니다. ");
                continue;
            }

            System.out.print("국어: ");
            int len_score = Integer.parseInt(br.readLine());
            if(! checkScore(len_score)) {
                continue;
            }
            System.out.print("영어: ");
            int english_score = Integer.parseInt(br.readLine());
            if(! checkScore(english_score)) {
                continue;
            }
            System.out.print("수학: ");
            int math_score = Integer.parseInt(br.readLine());
            if(! checkScore(math_score)) {
                continue;
            }

            System.out.print("과학: ");
            int science_score = Integer.parseInt(br.readLine());
            if(! checkScore(math_score)) {
                continue;
            }

            student.cal_total();
            student.cal_average();
            student.cal_grade();

            studentInfo.put(student.getName(), student);
            System.out.printf("=> 저장됨: %s (총점=%d, 평균=%f, 학점=%s)\n", student.getName(), student.getTotal(), student.getAverage(), student.getGrade());
            System.out.println("");
        }

    }

    public boolean loadCheck() {
        if (file.exists()) {
            System.out.println("파일 존재");
            return true;
        } else {
            return file.mkdirs();
        }
    }

    //사용자 입력양식? 화면 출력
    public void printUsage() {
        System.out.println("""
                [학생 성적 입력 프로그램]
                - 종료하려면 이름에 ^^를 입력하세요.
                - 점수는 0~100 사이의 정수만 허용됩니다.
                """);
    }

    @Override
    public void saveData() {

    }

    public boolean checkScore(int score){
        if (score < 0 || score > 100) {
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
            return false;
        }else{
            return true;
        }
    }
}
