import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library(mock(BookKeeper.class), mock(Computer.class));
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
