package August.day23.pratice.Prob3;

import java.io.*;

public class Student_Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("홍길동", 3);
        Student s2 = new Student("고길동", 4);

        String path = "C:/Temp/student.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        oos.writeObject(s1);
        oos.writeObject(s2);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        try {
            while (true) {
                Student s = (Student) ois.readObject();  //강제 형 변환 함 해보기
                System.out.println("학생 이름 : " + s.getName());
                System.out.println("학년 : " + s.getGrade() +"학년");
            }
        } catch (EOFException e) {
            System.out.println("파일 끝 ");
        }
    }
}
