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
        library = new Library();
        book1 = new Book("City Primeval", "Elmore Leonard", "Crime");
        book2 = new Book("A Wizard of Earthsea", "Ursula LeGuin", "Fantasy");
        book3 = new Book("Pet Sematary", "Stephen King", "Horror");
    }

    @Test
    public void stockCountStartsEmpty() {
        assertEquals(0, library.getStockCount());
    }
}


