package August.Score_Manager;

public class StudentInpput {
    public static void main(String[] args) throws Exception {

        InputImpl iimpl = new InputImpl();

        iimpl.printUsage();
        if (iimpl.loadCheck()) {
            iimpl.checkKeyAndInputData();
            iimpl.saveData();
        } else {
            System.out.println("파일 오류");
        }
    }
}
