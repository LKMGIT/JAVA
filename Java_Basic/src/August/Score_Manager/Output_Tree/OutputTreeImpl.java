package August.Score_Manager.Output_Tree;

import August.Score_Manager.Entity.Student;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class OutputTreeImpl implements OutputTreeInterface {
    private static final Comparator<Student> AVG_NAME_COMPARATOR = new AvgNameComparator();

    File file = new File("C:/Temp/student.dat");
    File out_file = new File("C:/Temp/orderByAug.dat");
    HashMap<String, Student> studentInfo = new HashMap<>();
    TreeSet<Student> students = new TreeSet<>();

    @Override
    // HashMap으로 데이터 받아오기
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
    //받아온 데이터를 TreeSet구조로 변환
    public void createTreeSet() {
        students = new TreeSet<>(AVG_NAME_COMPARATOR);
        students.addAll(studentInfo.values());
    }

    @Override
    public void printResult() {
        System.out.print("[정렬 및 저장: 평균 오름차순]\n");
        System.out.println("불러온 학생 수 : " + students.size());
        System.out.println("정렬 규칙: 평균 ASC, 평균 동률이면 이름 사전순 ASC\n");
        System.out.println("저장 대상(미리보기 상위 10명):");
        for (Student student : students) {
            System.out.println("- " + student.getName() + " (평균 " + student.getAverage() + ")");
        }
        System.out.println("");
        System.out.println("결과 파일: ./orderByAug.dat");
    }


    @Override
    public void outputObject() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(out_file));
        out.writeObject(students);
        System.out.println("[완료] 정렬된 결과를 파일로 저장했습니다. ");
        out.close();
    }

    private static final class AvgNameComparator implements Comparator<Student>, Serializable {
        private static final long serialVersionUID = 1L;
        @Override
        public int compare(Student a, Student b) {
            int c = Double.compare(a.getAverage(), b.getAverage()); // 평균 오름차순
            if (c != 0) return c;
            return a.getName().compareTo(b.getName());              // 이름 오름차순
        }
    }
}
