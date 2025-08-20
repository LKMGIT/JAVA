package August.day19.boardex;

public class BoardMain {
    public static void main(String[] args) {
        BoardManger boardManger = new BoardManger();
        BoardExample boards = new BoardExample(boardManger);
        // BoardExample boardExample = new BoardExample();
        boards.run();
    }

}
