package August.day22.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김철수", 21, 3.5),
                new Student("이영희", 22, 3.9),
                new Student("박민수", 20, 3.2)
        );

        String filename = "students.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (Student s : students) {
                dos.writeUTF(s.getName());
                dos.writeInt(s.getAge());
                dos.writeDouble(s.getScore());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Student[] studentArray = new Student[students.size()];
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            for (int i = 0; i < students.size(); i++) {
                String name = dis.readUTF();
                int age = dis.readInt();
                double score = dis.readDouble();
                studentArray[i] = new Student(name, age, score);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Arrays.sort(studentArray);
        System.out.println(Arrays.toString(studentArray));
        double total = 0;
        double avg = 0;
        for (Student s : studentArray) {
            total += s.getScore();
        }
        avg = total / studentArray.length;

        System.out.printf("총점 : %.1f\n", total);
        System.out.printf("반 평균 : %.1f", avg);
        System.out.println("");

        for (Student s : studentArray) {
            System.out.println(s.getName() + " : " + s.getAge());
        }



    }
}
