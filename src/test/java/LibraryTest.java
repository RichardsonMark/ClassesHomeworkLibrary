import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void before() {
        library = new Library("CodeClan", 7);
    }

    @Test
    public void libraryHasNoBooksToBegin(){
        assertEquals(0, library.getBookCount());
    }
}
