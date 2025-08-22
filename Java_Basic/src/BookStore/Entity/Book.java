package BookStore.Entity;

public class Book {

    private String book_id;
    private String book_name;
    private String book_author;
    private String book_publisher;
    private int book_price;

    public Book(String book_id, String book_name, String book_author, String book_publisher, int book_price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_publisher = book_publisher;
        this.book_price = book_price;
    }

    public String getBook_name() {
        return book_name;
    }


    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
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

}
