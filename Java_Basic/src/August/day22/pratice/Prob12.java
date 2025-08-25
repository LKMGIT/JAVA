package August.day22.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("numbers.dat");
        dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("numbers.dat");
        dis = new DataInputStream(fis);

        for (int i = 0; i < 3; i++) {
            int num = dis.readInt();
            System.out.print(num +" ");
        }
        dis.close();
        fis.close();

    }
}

/*
        //데이터입출력객체 생성
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("primitive.db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("서유미");
        dos.writeInt(10);
        dos.writeDouble(3.14);
        dos.writeBoolean(Boolean.TRUE);

        dos.flush();
        dos.close();
        fos.close();


        //DataInputStream 객체
        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("primitive.db");
        dis = new DataInputStream(fis);

        for (int i = 0; i < 1; i++) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double price = dis.readDouble();
            boolean flag = dis.readBoolean();
            System.out.println(name + " " + age + " " + price + " " + flag);
        }
        dis.close();
        fis.close();
 */