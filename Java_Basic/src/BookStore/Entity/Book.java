package BookStore.Entity;

public class Book {

    private int book_id;
    private String book_name;
    private int book_count;
    private String book_author;
    private String book_publisher;
    private int book_price;

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

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBook_count(int book_count) {
        this.book_count = book_count;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    @Override
    public String toString() {
        return "책 이름: " + book_name + ", 수량: " + book_count;
    }
}
