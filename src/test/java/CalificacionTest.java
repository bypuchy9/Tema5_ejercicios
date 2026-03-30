import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalificacionTest {

    @Test
    void testNotaNoValida() {
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(-1));
    }

    @Test
    void testSuspenso() {
        assertEquals("SUSPENSO", Calificacion.calificacion(3));
    }

    @Test
    void testSuficiente() {
        assertEquals("SUFICIENTE", Calificacion.calificacion(5));
    }

    @Test
    void testBien() {
        assertEquals("BIEN", Calificacion.calificacion(6));
    }

    @Test
    void testNotable() {
        assertEquals("NOTABLE", Calificacion.calificacion(8));
    }

    @Test
    void testSobresaliente() {
        assertEquals("SOBRESALIENTE", Calificacion.calificacion(10));
    }
}