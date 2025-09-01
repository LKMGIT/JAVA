package August.Score_Manager.Output;

public interface OutputInterface {
    public boolean loadCheck() throws Exception;
    public void printUsage();
    public void saveData() throws Exception;
    public void checkKeyAndInputData() throws Exception;
}
