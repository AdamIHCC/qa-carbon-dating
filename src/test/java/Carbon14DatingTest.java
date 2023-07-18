import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Carbon14DatingTest {
    //#1 Build a test for calculateAge();

    /*
        #2 Build a test for setRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */

   /*
        #3 Build a test for getRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */

    // #4 Build a test for the toString() method.
    @Test
    public void testToString() {
        Carbon14Dating c = new Carbon14Dating(20);
        String actual = c.toString();
        String expected = "The age of the sample is: 13,305 years";
        assertEquals(expected, actual);
    }
}
