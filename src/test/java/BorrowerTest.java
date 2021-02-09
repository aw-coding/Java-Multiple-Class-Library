import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower mike;

    @Before
    public void before() {
        mike = new Borrower("Mike");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Mike", mike.getName());
    }

}
