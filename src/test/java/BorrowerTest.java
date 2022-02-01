import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(2);
        book = new Book("Elmore Leonard", "City Primeval", "Crime");
    }

    @Test
    public void bookCollectionStartsEmpty() {
        assertEquals(0, borrower.getBookCollectionCount());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(0, library.getStockCount());
        assertEquals(1, borrower.getBookCollectionCount());
    }

}
