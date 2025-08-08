package August.day13.interface3;

public class User {
    public static void main(String[] args) {
        InterfaceImpl inpl = new InterfaceImpl();

        interfaceA ia = inpl;

        ia.methodA();

        inpl.methodB();

        interfaceB ib = inpl;

        ib.methodB();

    }
}
