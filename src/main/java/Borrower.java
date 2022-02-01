import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookCollection;

    public Borrower() {
        bookCollection = new ArrayList<Book>();
    }

    public int getBookCollectionCount() {
        return bookCollection.size();
    }

    public void borrowBook(Library library, Book book) {
        library.removeBook(book);
        this.bookCollection.add(book);
    }
}
