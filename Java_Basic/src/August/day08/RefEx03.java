package August.day08;

public class RefEx03 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";



        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));


    }
}
