package August.Score_Manager;

import java.io.*;

public class OutputImpl implements Out_Interface {
    String path = "C:/Temp/student.dat";
    File file = new File(path);


    @Override
    public void loadObjectFromFile() throws IOException {
        if (!file.exists()) {
            System.out.println("student.dat 파일이 존재하지 않습니다.");
        }else{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            
        }


    }

    @Override
    public void rearrangeData() {

    }

    @Override
    public void printInfo() {

    }


}
