package BookStore.service;

import BookStore.Entity.Book;

public interface Cart_interface {

    public void menuCartAddItem(Book book);
    public void menuCartItemList();
    public void menuCartClear();
    public void menuCartRemoveItemCount(String book_name, int book_count);
    public void menuCartRemoveItem(String book_name);
    public void menuCartBill(UserImpl userimpl);

}
