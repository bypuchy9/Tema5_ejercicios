import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClasificarEdadTest {

    @Test
    void testEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> Edad.clasificarEdad(-1));
    }

    @Test
    void testInfancia() {
        assertEquals("Infancia", Edad.clasificarEdad(3));
    }

    @Test
    void testNinez() {
        assertEquals("Niñez", Edad.clasificarEdad(10));
    }

    @Test
    void testAdolescencia() {
        assertEquals("Adolescencia", Edad.clasificarEdad(15));
    }

    @Test
    void testJuventud() {
        assertEquals("Juventud", Edad.clasificarEdad(20));
    }

    @Test
    void testAdultez() {
        assertEquals("Adultez", Edad.clasificarEdad(40));
    }

    @Test
    void testVejez() {
        assertEquals("Vejez", Edad.clasificarEdad(70));
    }
}