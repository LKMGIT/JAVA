package August.day18.Task;

import java.util.ArrayList;
import java.util.List;

public class BoardExample {
    public static void main(String[] args) {
     List<Board> boards = new ArrayList<Board>();

    }
    
    public void list(Board[] boards) {
        System.out.println("""
                [게시물 목록]
                --------------------------------------------------
                no     writer      date         title
                --------------------------------------------------""");
        for(Board b : boards){
            System.out.println(b.getBno() + "    " + b.getBwriter() +
                    "    " + b.getBdate() + "    " + b.getBtitle());
        }
        System.out.println("");
        System.out.println("------------------------------------------");
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("""
                메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit
                메누 선택 : """);
    }
}
