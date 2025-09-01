package August.Score_Manager.Input;

import August.Score_Manager.Entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class InputImpl implements InputInterface {
    String path = "C:/Temp/student.dat";
    File file = new File(path);
    HashMap<String, Student> studentInfo = new HashMap<>();
    ArrayList<Student> datas;
    String[] names;

    @Override
    // 파일에 있는 정보 HASHMAP으로 받아오기
    public void loadObjectFromFile() throws Exception {
        if (!file.exists()) {
            System.out.println("student.dat 파일이 존재하지 않습니다.");
        } else {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            studentInfo = (HashMap<String, Student>) in.readObject();
            in.close();
        }
    }

    @Override
    public void rearrangeData() {
        // HashMap의 Student 부분 즉 값부분을 받아서 datas 에 넣음
        datas = new ArrayList<>(studentInfo.values());
        //datas 안에 평균 값 기준으로 정렬
        datas.sort(Comparator.comparingDouble(Student::getAverage));
        // names String 배열 안에 정렬된 기준으로 저장
        names = datas.stream().map(Student::getName).toArray(String[]::new);
    }

    @Override
    public void printInfo() {
        System.out.println("[평균 오름차순 성적표]");
        int count = 1;
        for (Student s : datas) {
            System.out.print("\n" + count++ + ") " + s.getName() + "\n");
            System.out.print("\t" + s.getRecode() + "\n");
            System.out.print("\t" + "총점: " + s.getTotal() + ", 평균: " + s.getAverage() + ", 학점: " + s.getGrade() + "\n");
        }

    }


}
