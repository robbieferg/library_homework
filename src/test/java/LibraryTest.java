import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("City Primeval", "Elmore Leonard", "Crime");
        book2 = new Book("A Wizard of Earthsea", "Ursula LeGuin", "Fantasy");
        book3 = new Book("Pet Sematary", "Stephen King", "Horror");
    }

    @Test
    public void stockCountStartsEmpty() {
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.getStockCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void bookWillNotAddIfStockFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getStockCount());
    }
}


