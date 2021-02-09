import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book carrie;

    @Before
    public void before() {
        library = new Library(3);
        carrie = new Book("Carrie", "Stephen King", "Horror");
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void checkCollectionSize(){
        assertEquals(0, library.getCollectionSize());
    }

    @Test
    public void canAddToCollection(){
        library.addBook(carrie);
        assertEquals(1, library.getCollectionSize());
    }



}
