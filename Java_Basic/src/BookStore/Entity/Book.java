package BookStore.Entity;

public class Book {

    private String book_name;
    private int book_count;


    public Book(String book_name, int book_count) {
        this.book_name = book_name;
        this.book_count = book_count;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getBook_count() {
        return book_count;
    }

    public void setCount(int count) {
        this.book_count = count;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    @Override
    public String toString() {
        return "책 이름: " + book_name + ", 수량: " + book_count;
    }
}