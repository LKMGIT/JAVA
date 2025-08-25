package August.day22.pratice;

import java.io.*;
import java.util.Arrays;

//문제 : 정수 배열 {5,10,15,20} dmf array.dat에 저장한 후 다시 읽어 합계와 평균을 구하고 평균을 기준으로 정렬하여 콘솔에 출력하세요
public class Prob14 {
    public static void main(String[] args) throws Exception {

        int[] array = {5, 10, 15, 20};
        String filename = "array.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(array.length);
            for (int num : array) {
                dos.writeInt(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] readArray = null;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            readArray = new int[dis.readInt()];
            for (int i = 0; i < readArray.length; i++) {
                readArray[i] = dis.readInt();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum = 0;
        double avg = 0.0;
        if (readArray == null) {
            sum = 0;
            for (int num : readArray) {
                sum += num;
               avg = sum / readArray.length;
            }
        }


        System.out.println("읽어온 배열 " + Arrays.toString(readArray));
        System.out.println("합계 " + sum);
        System.out.println("평균 : " + avg);

    }
}
