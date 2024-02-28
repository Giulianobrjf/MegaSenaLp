import org.example.PremioJogador;
import org.junit.Test;
import static org.junit.Assert.*;

public class PremioJogadorTest {
    @Test
    public void testCalculaPremioJogador() {
        PremioJogador premio = new PremioJogador(1000.0, 6);
        assertEquals(1000.0, premio.getValorPremioRecebido(), 0.01);

        premio = new PremioJogador(1000.0, 5);
        assertEquals(200.0, premio.getValorPremioRecebido(), 0.01);

        premio = new PremioJogador(1000.0, 4);
        assertEquals(50.0, premio.getValorPremioRecebido(), 0.01);

        premio = new PremioJogador(1000.0, 3);
        assertEquals(0.0, premio.getValorPremioRecebido(), 0.01);
    }
}