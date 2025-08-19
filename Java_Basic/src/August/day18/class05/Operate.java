package August.day18.class05;

public interface Operate {

    int operate(int a, int b);

    default void print(){
        System.out.println("print");
    }
}
