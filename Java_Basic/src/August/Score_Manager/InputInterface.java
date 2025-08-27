package August.Score_Manager;

public interface InputInterface {
    public boolean loadCheck() throws Exception;
    public void printUsage();
    public void saveData() throws Exception;
    public void checkKeyAndInputData() throws Exception;
}
