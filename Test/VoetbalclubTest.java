import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub Ajx;
    private Voetbalclub Feij;

    @BeforeEach
    public void voetbalclubTest() {
        Ajx = new Voetbalclub("Ajax");
    }

    @Test
    void clubnaamTest() {
        Feij = new Voetbalclub("");
        assertEquals("Fc", Feij.getNaam());
    }

    @Test
    void verwerkResultaatTest() {
        Ajx.verwerkResultaat('w');
        Ajx.verwerkResultaat('g');
        Ajx.verwerkResultaat('v');
        Ajx.verwerkResultaat('y');
        assertEquals(4, Ajx.aantalPunten());
        assertEquals(3, Ajx.aantalGespeeld());
    }

    @Test
    void toStringTest() {
        Ajx.verwerkResultaat('w');
        Ajx.verwerkResultaat('g');
        Ajx.verwerkResultaat('v');
        assertEquals("Ajax 3 1 1 1 4", Ajx.toString());
    }

    @Test
    void herhalingTest() {
        Ajx.verwerkResultaat('w');
        Ajx.verwerkResultaat('w');
        assertEquals(6, Ajx.aantalPunten());
        Ajx.verwerkResultaat('g');
        Ajx.verwerkResultaat('v');
        assertEquals(7, Ajx.aantalPunten());
        assertEquals(4, Ajx.aantalGespeeld());


    }

}
