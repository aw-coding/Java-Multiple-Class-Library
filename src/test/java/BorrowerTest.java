import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower mike;
    private Library library;
    private Book carrie;
    private Book alanClark;
    private Book culturalAmnesia;

    @Before
    public void before() {
        mike = new Borrower("Mike");
        library = new Library(5);
        carrie = new Book("Carrie", "Stephen King", "Horror");
        alanClark = new Book("The Alan Clark Diaries", "Alan Clark", "Memoir");
        culturalAmnesia = new Book("Cultural Amnesia", "Clive James", "Non-Fiction");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Mike", mike.getName());
    }

    @Test
    public void borrowerHasCollection() {
        assertEquals(0, mike.getCollectionSize());
    }
    @Test
    public void canBorrowBook(){
        library.addBook(alanClark);
        mike.borrowBook(library, alanClark);
        assertEquals(1, mike.getCollectionSize());
        }

    }


