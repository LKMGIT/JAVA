package BookStore.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
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

    @Override
    public String toString() {
        return "책 이름 :'" + book_name + '\'' +
                ", 책 수량 : " + book_count;
    }
}
