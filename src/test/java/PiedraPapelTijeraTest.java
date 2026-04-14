import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PiedraPapelTijeraTest {

    @Test
    void jugadaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            PiedraPapelTijera.jugar("PIEDRA", "FUEGO");
        });
    }

    @Test
    void empate() {
        assertEquals("EMPATE", PiedraPapelTijera.jugar("PIEDRA", "PIEDRA"));
    }

    @Test
    void piedraGanaATijera() {
        assertEquals("JUGADOR1", PiedraPapelTijera.jugar("PIEDRA", "TIJERA"));
    }

    @Test
    void tijeraGanaAPapel() {
        assertEquals("JUGADOR1", PiedraPapelTijera.jugar("TIJERA", "PAPEL"));
    }

    @Test
    void papelGanaAPiedra() {
        assertEquals("JUGADOR1", PiedraPapelTijera.jugar("PAPEL", "PIEDRA"));
    }

    @Test
    void ganaJugador2() {
        assertEquals("JUGADOR2", PiedraPapelTijera.jugar("PIEDRA", "PAPEL"));
    }
}