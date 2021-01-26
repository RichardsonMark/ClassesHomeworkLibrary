import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Ubik", "Philip K Dick", "Science Fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Ubik", book.getTitle());
    }
}
