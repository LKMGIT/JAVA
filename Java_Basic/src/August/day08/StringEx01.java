package August.day08;

public class StringEx01 {
    public static void main(String[] args) {


        StringBuffer sb1 = new StringBuffer();

        sb1.append("Hello");
        sb1.append("My");
        sb1.append("Name");
        sb1.append("is");

        String result = sb1.toString();

        System.out.println(sb1);
        System.out.println(result);

    }
}
