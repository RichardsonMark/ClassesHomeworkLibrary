import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;


    @Before
    public void before() {
        library = new Library("CodeClan", 7);
        book = new Book("Androids Dream of Electric Sheep", "Philip K Dick", "Science Fiction");
    }

    @Test
    public void libraryHasNoBooksToBegin(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddABook(){
        library.addABook(book);
        assertEquals(1, library.getBookCount());
    }
}
