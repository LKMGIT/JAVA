package BookStore.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {

    private int id;
    private String book_id;
    private String book_name;
    private String book_author;
    private String book_publisher;
    private int book_price;

}
