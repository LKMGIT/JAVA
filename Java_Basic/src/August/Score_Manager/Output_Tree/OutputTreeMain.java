package August.Score_Manager.Output_Tree;

public class OutputTreeMain {
    public static void main(String[] args) throws Exception {
        OutputTreeImpl outputTree = new OutputTreeImpl();
        outputTree.loadObjectFromFile();
        outputTree.createTreeSet();
        outputTree.printResult();
        outputTree.outputObject();
    }
}
