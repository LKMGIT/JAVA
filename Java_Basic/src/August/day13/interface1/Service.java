package August.day13.interface1;

public interface Service {
    // default 메소드
    default void defaultMethod1() {
        System.out.println("defalut1");
        defaultCommon(); // default 안에서 중복이 일어날 때 선언하고 불러서 사용
    }

    default void defaultMethod2() {
        System.out.println("defalut2");
        defaultCommon();
    }

    //private 메소드

    private void defaultCommon(){
        System.out.println("defaultMethod의 중복코드 A");
        System.out.println("defaultMethod의 중복코드 B");
    }

    //static 메소드

    static void staticMethod(){
        System.out.println("staticMethod1 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 코드");
        staticCommon();
    }

    // private static 메소드

    private static void staticCommon(){
        System.out.println("staticMethod 중복 코드 A");
        System.out.println("staticMethod 중복 코드 B");
    }

}
