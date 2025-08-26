package August.day23;

import lombok.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable {
    private static final long serialVersionUID = 1L;  // 역직렬화를 사용할 때 순서를 알기 위해 사용
    private String name;
    private transient int age; // 직렬화 대상 필드에서 제외 
    public static int count = 0; // 얘도 제외 static 필드는 직렬화 대상에ㅔ서 제ㅔ외
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Product implements Serializable {
    private static final long serialVersionUID = 1L; // 역직렬화를 사용할 때 순서를 알기 위해 사용
    private String pname;
    private int price;
}


public class ObjectOustEx {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        User user = new User("신세계", 20);
        Product product = new Product("삼성 노트북", 1500000);
        int[] arr1 = {10, 20, 30};
        List<Product> products = new ArrayList<>();

        oos.writeObject(products);
        oos.writeObject(arr1);
        oos.writeObject(product);
        oos.writeObject(user);

        oos.flush();
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/object.dat"));

        try{
            while(true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        }catch(EOFException e){
            System.out.println("파일 끝");
        }finally{
            ois.close();
        }

    }
}
