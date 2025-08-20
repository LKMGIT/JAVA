package August.day18.Task;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

public class BoardManager implements Board_interface {
    private final List<Board> boards = new ArrayList<Board>();

    @Override
    public void create(Board board) {
        // 글번호 자동 생성
        int nextNo = 1;
        for (int i = 0; i < boards.size(); i++) {
            int no = boards.get(i).getBno();
            if (no >= nextNo) nextNo = no + 1;
        }
        if (board.getBno() == 0) board.setBno(nextNo);
        if (board.getBdate() == null) board.setBdate(new java.util.Date());
        boards.add(board);
    }

    @Override
    public void read(int bno) {
        Board target = null;
        for (int i = 0; i < boards.size(); i++) {
            Board b = boards.get(i);
            if (b.getBno() == bno) {
                target = b;
                break;
            }
        }
        if (target == null) {
            System.out.println(">> 해당 번호의 게시물이 없습니다.");
            return;
        }

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println();
        System.out.println("[게시물 상세]");
        System.out.println("------------------------------");
        System.out.println("번호   : " + target.getBno());
        System.out.println("제목   : " + target.getBtitle());
        System.out.println("내용   : " + target.getBcontent());
        System.out.println("작성자 : " + target.getBwriter());
        System.out.println("날짜   : " + fmt.format(target.getBdate()));
        System.out.println("------------------------------");
        System.out.println();
    }

    @Override
    public void clear() {
        boards.clear();
        System.out.println(">> 모든 게시물을 삭제했습니다.");
    }

    public List<Board> getBoards() {
        return boards;
    }
}
