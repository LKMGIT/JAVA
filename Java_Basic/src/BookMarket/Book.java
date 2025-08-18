package BookMarket;

public class Book extends Item{

    private String author;
    private String description;
    private String category;
    private String releaseData;


    public Book(String bookId, String name, int unitPrice) {
        super(bookId, name, unitPrice);
    }

    public Book(String bookId, String name, int unitPrice, String author, String description, String category, String releaseData) {
        super(bookId, name, unitPrice);
        this.author = author;
        this.description = description;
        this.category = category;
        this.releaseData = releaseData;
    }

    public String getBookId() {return bookId;}
    public void setBookId(String bookId) {this.bookId = bookId;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getUnitPrice() {return unitPrice;}
    public void setUnitPrice(int unitPrice) {this.unitPrice = unitPrice;}


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(String releaseData) {
        this.releaseData = releaseData;
    }
}
