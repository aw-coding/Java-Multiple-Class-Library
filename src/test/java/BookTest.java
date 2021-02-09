import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book carrie;

    @Before
    public void before(){
        carrie = new Book("Carrie", "Stephen King", "Horror");
    }


    @Test
    public void hasTitle(){
        assertEquals("Carrie", carrie.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Stephen King", carrie.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Horror", carrie.getGenre());
    }





}
