import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

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
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void cannotAddABookNoSpace(){
        library.addABook(book);
        library.addABook(book2);
        library.addABook(book3);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void canLoanABookToBorrower(){
        library.addABook(book);
        library.addABook(book2);
        library.loanABook(book2);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canGetNumberOfGenres() {
        library.addABook(book);
        library.addABook(book2);
        HashMap<String, Integer> genres = library.getGenreMap();
        int numGenres = genres.get(book.getGenre());
        assertEquals(2, numGenres);
    }
}
