import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Borrower borrower;
    private Library library;

    @Before
    public void before(){
        book = new Book("Ubik", "Philip K Dick", "Science Fiction");
        borrower = new Borrower("Mark");
        library = new Library("CodeClan", 2);

    }


    @Test
    public void borrowerStartsEmpty(){
        assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBookToCollection(library, book);
        assertEquals(1, borrower.getCollectionCount());
    }

    @Test
    public void canRemoveBook(){
        borrower.addBookToCollection(library, book);
        assertEquals(1, borrower.getCollectionCount());
        borrower.removeBookFromCollection();
        assertEquals(0, borrower.getCollectionCount());
    }

}
