package August.day19.boardex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager {
    private Map<String, Board> boardMap = new LinkedHashMap<>();


    //Singletone Pattern
    private static BoardManager boardManagerSingle = new BoardManager();

    public static BoardManager getInstance() {
        return boardManagerSingle;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }


}
