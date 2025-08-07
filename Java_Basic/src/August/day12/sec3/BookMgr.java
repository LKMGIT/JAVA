package August.day12.sec3;

public class BookMgr {

    Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist() {
        for (int i = 0; i < this.booklist.length; i++) {
            System.out.println(this.booklist[i].getTitle());
        }
    }

    public void printTotalPrice() {
        int sum = 0;
        for (int i = 0; i < this.booklist.length; i++) {
            sum += this.booklist[i].getPrice();
        }
        System.out.println(sum);
    }
}
