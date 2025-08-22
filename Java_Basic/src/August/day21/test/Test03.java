package August.day21.test;

public class Test03 {
    int i;
    Integer iI;

    public void satHello(){
        System.out.println("Hello World");
    }

    public static void sayHi(){
        System.out.println("say hi");
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
       // iI = 3;

        System.out.println(test03.i);
        System.out.println(test03.iI);
    }

}
// 클래스의 정적(static) 멤버는 각각의 인스턴스 아닌 클래스에 속하기 때문에
//컴파일 타임에 JVM static area에 최적화 ㄷ되어 저장
