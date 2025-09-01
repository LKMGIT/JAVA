package August.Score_Manager.Output;

import August.Score_Manager.Entity.Student;
import August.day13.interface3.InterfaceImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OutImpl implements OutputInterface {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Student> studentInfo = new HashMap<>();
    String path = "C:/Temp/student.dat";
    File file = new File(path);


    // 사용자 정보 입력 후 Map에 저장, 화면에 출력
    public void checkKeyAndInputData() throws IOException {
        while (true) {
            Student student = new Student();
            List<Integer> recode = new ArrayList<>();
            System.out.print("이름: ");
            String name = br.readLine();
            if (studentInfo.containsKey(name)) {
                System.out.println("이름이 중복입니다. ");
                continue;
            }else if (name.equals("^^")) {
                break;
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
            if(! checkScore(science_score)) {
                continue;
            }
            student.setName(name);

            recode.add(len_score);
            recode.add(math_score);
            recode.add(english_score);
            recode.add(science_score);
            student.setRecode(recode);

            student.cal_total();
            student.cal_average();
            student.cal_grade();

            studentInfo.put(student.getName(), student);
            System.out.printf("=> 저장됨: %s (총점=%d, 평균=%f, 학점=%s)\n", student.getName(), student.getTotal(), student.getAverage(), student.getGrade());
            System.out.println("");
        }

    }

    public boolean loadCheck() throws FileNotFoundException {
        if (file.exists()) {
            System.out.println("파일 존재");
            PrintStream ps = new PrintStream(file);
            ps.print("");
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

    public void saveData() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Temp/student.dat"));
        out.writeObject(studentInfo);
        System.out.println("[완료] " + studentInfo.size() + "명의 정보가 student.dat 에 저장되었습니다.");
        out.close();
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
