package August.day08;

public class InternEx {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String(new char[]{'H', 'e', 'l','l', 'o'}).intern();


        System.out.println(str1 == str2);

    }
}
