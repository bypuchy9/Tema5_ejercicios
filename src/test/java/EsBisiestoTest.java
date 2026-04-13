import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EsBisiestoTest {

    @Test
    void divisiblePor4NoPor100() {
        assertTrue(Fecha.esBisiesto(2024));
    }

    @Test
    void divisiblePor100NoPor400() {
        assertFalse(Fecha.esBisiesto(1900));
    }

    @Test
    void divisiblePor400() {
        assertTrue(Fecha.esBisiesto(2000));
    }

    @Test
    void noDivisiblePor4() {
        assertFalse(Fecha.esBisiesto(2023));
    }
}