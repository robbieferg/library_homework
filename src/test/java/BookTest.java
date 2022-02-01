import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("City Primeval", "Elmore Leonard", "Crime");
    }

    @Test
    public void bookHasValues() {
        assertEquals("City Primeval", book.getTitle());
        assertEquals("Elmore Leonard", book.getAuthor());
        assertEquals("Crime", book.getGenre());
    }

}
