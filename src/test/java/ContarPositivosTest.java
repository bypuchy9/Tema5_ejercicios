import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContarPositivosTest {

    @Test
    void testArrayVacio() {
        int[] num = {};
        assertEquals(0, Positivos.contarPositivos(num));
    }

    @Test
    void testArrayTodosNegativos() {
        int[] num = {-1, -5, -10};
        assertEquals(0, Positivos.contarPositivos(num));
    }

    @Test
    void testArrayMezcla() {
        int[] num = {2, -3, 0, 5};
        assertEquals(2, Positivos.contarPositivos(num));
    }
}