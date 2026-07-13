package SpringCore3.Program04;

public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private int price;

   
    public Book() {
        System.out.println("Default Constructor Called");
    }

  
    public Book(int bookId, String bookName, String authorName, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
    }
}