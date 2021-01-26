import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library("CodeClan", 2);
        book = new Book("Androids Dream of Electric Sheep", "Philip K Dick", "Science Fiction");
        book2 = new Book("The Man in the High Castle", "Philip K Dick", "Science Fiction");
        book3 = new Book("A Scanner Darkly", "Philip K Dick", "Science Fiction");
    }

    @Test
    public void libraryHasNoBooksToBegin(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddABook(){
        library.addABook(book);
        library.addABook(book2);
        library.addABook(book3);
        assertEquals(2, library.getBookCount());
    }
}
