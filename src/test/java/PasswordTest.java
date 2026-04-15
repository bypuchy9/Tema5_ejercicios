import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PasswordTest {

    @ParameterizedTest
    @CsvSource({
            "abc, 1",
            "abcdefgh, 2",
            "Abcdefgh, 3",
            "Abcdefg1, 4",
            "Abcdef1!, 5"
    })
    void testEvaluarPassword(String password, int esperado) {
        assertEquals(esperado, Password.evaluarPassword(password));
    }
}