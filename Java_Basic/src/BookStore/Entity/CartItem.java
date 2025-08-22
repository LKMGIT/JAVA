package BookStore.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
    private String book_id;
    private String book_name;
    private String book_author;
    private String book_publisher;
    private int book_price;
    private int book_count;

    public CartItem(String book_id, int book_count) {
        this.book_id = book_id;
        this.book_count = book_count;
    }

    public CartItem(String book_id, String book_name, String book_author, String book_publisher, int book_price, int book_count) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_publisher = book_publisher;
        this.book_price = book_price;
        this.book_count = book_count;
    }


}
