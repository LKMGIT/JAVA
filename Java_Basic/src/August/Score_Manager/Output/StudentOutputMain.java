package August.Score_Manager.Output;

public class StudentOutputMain {
    public static void main(String[] args) throws Exception {

        OutImpl iimpl = new OutImpl();

        iimpl.printUsage();
        if (iimpl.loadCheck()) {
            iimpl.checkKeyAndInputData();
            iimpl.saveData();
        } else {
            System.out.println("파일 오류");
        }
    }
}
