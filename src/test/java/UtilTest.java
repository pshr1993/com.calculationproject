import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class UtilTest {
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Integer a = 15;
        Integer b = 15;
        Integer expResult = 30;
        Integer result = Addition.add(a, b);
        assertEquals(expResult, result);
        assertEquals(null, Addition.add(15, null));
        assertEquals(null, Addition.add(null, 15));
        assertEquals(null, Addition.add(null, null));
    }
}

