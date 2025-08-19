package August.day18.Task;

import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class BoardExample {
    public static void main(String[] args) {
        BoardManager manager = new BoardManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            mainMenu();
            System.out.print("메뉴 선택 : ");
            String sel = sc.nextLine().trim();

            if ("1".equals(sel)) { // Create
                System.out.println();
                System.out.println("[새 게시물 입력]");
                System.out.print("제목: ");
                String title = sc.nextLine();
                System.out.print("내용: ");
                String content = sc.nextLine();
                System.out.print("작성자: ");
                String writer = sc.nextLine();

                System.out.println();
                System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
                System.out.print("메뉴 선택: ");
                String c = sc.nextLine().trim();

                if ("1".equals(c)) {
                    Board b = new Board();
                    b.setBtitle(title);
                    b.setBcontent(content);
                    b.setBwriter(writer);
                    b.setBdate(new java.util.Date());
                    manager.create(b);
                    System.out.println(">> 저장되었습니다.\n");
                    list(manager.getBoards()); // 저장 후 목록 표시
                } else {
                    System.out.println(">> 저장이 취소되었습니다.\n");
                }

            } else if ("2".equals(sel)) { // Read (단건 상세)
                list(manager.getBoards());
                System.out.print("상세보기할 게시물 번호(bno): ");
                try {
                    int bno = Integer.parseInt(sc.nextLine().trim());
                    manager.read(bno);
                } catch (NumberFormatException e) {
                    System.out.println(">> 번호는 정수로 입력하세요.\n");
                }

            } else if ("3".equals(sel)) { // Clear
                manager.clear();
                System.out.println();

            } else if ("4".equals(sel)) { // Exit
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println(">> 올바른 번호를 입력하세요.\n");
            }
        }
        sc.close();
    }

    // 목록 출력(최신 글이 위로 오도록 역순)
    public static void list(List<Board> boards) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println("""
                [게시물 목록]
                --------------------------------------------------
                no    writer    date       title
                --------------------------------------------------""");
        for (int i = boards.size() - 1; i >= 0; i--) {
            Board b = boards.get(i);
            String dateStr = (b.getBdate() == null) ? "" : fmt.format(b.getBdate());
            System.out.printf("%-5d %-9s %-10s %s%n",
                    b.getBno(), b.getBwriter(), dateStr, b.getBtitle());
        }
        System.out.println("--------------------------------------------------\n");
    }

    public static void mainMenu() {
        System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
    }
}
