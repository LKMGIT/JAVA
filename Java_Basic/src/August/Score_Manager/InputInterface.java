package August.Score_Manager;

public interface InputInterface {
    public boolean loadCheck();
    public void printUsage();
    public void saveData();
    public void checkKeyAndInputData() throws Exception;
}
