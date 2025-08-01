package August.day08;

public class RefEx02 {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());    // 얘랑

        a += " Java Programming";
        System.out.println(a.hashCode());  // 얘 주소가 다름

        // 즉 Hello 공간에 붙이는 것이 아닌
        // 새 공간을 할당하여 a를 저장

        print(a);
        System.out.println(a);


    }
    public static void print(String a){
        a = "world";
        System.out.println(a.hashCode());
    }

}
