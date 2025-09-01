package August.Score_Manager.Input;

public class StudentInputMain {
    public static void main(String[] args) throws Exception {
        InputImpl inputImpl = new InputImpl();

        inputImpl.loadObjectFromFile();
        inputImpl.rearrangeData();
        inputImpl.printInfo();
    }

}
