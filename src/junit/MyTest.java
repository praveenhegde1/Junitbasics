package junit;




import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MyTest {

    @Test
    public void testAdd() {
        int a = 1;
        int b = 2;
        int expected = 3;
        int actual = a + b;
       assertEquals(expected, actual);
    }
}
