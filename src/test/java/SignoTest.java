import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SignoTest {

    @Test
    void testPositivo() {
        assertEquals(1, Signo.signo(5));
    }

    @Test
    void testNegativo() {
        assertEquals(-1, Signo.signo(-3));
    }

    @Test
    void testCero() {
        assertEquals(0, Signo.signo(0));
    }
}