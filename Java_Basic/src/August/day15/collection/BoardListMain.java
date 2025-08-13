package August.day15.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        //글 하나르 작성하여 게시판에 올리기
        boardList.add(new Board("컬렉션","매우 쉽지 않음", "홍길동"));

        int size = boardList.size();

        System.out.println("전체 글 수 : " + size);

        for (Board board : boardList) {
            System.out.println("제목 " + board.getSubject() + "내용 : " + board.getContent() +
                    "작성자" + board.getWriter() );
        }

    }
}
