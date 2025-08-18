package BookMarket;

public class Cart implements CartInterface{
    static final int NUM_BOOK  = 3;
    CartItem[] mCartItem = new CartItem[NUM_BOOK];
    static int mCartCount = 0;

    public Cart(){};
    public void printBookList(Book[] booklist){
        for(int i = 0; i < booklist.length; i++){
            System.out.print(booklist[i].getBookId() + " | ");
            System.out.print(booklist[i].getName() + " | ");
            System.out.print(booklist[i].getUnitPrice() + " | ");
            System.out.print(booklist[i].getAuthor() + " | ");
            System.out.print(booklist[i].getDescription() + " | ");
            System.out.print(booklist[i].getCategory() + " | ");
            System.out.print(booklist[i].getReleaseData() + " | ");
            System.out.println("");
        }
    }

    public void insertBook(Book book){
        mCartItem[mCartCount++] = new CartItem(book);
    }


}
