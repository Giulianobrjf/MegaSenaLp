import org.example.VerificaAcertos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class VerificaAcertosTest {

    @Test
    void testNumerosEscolhidosValidos() {
        ArrayList<Integer> numerosEscolhidos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> numerosSorteados = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        VerificaAcertos verifica = new VerificaAcertos(numerosEscolhidos, numerosSorteados);

        // Testando com um conjunto válido de números escolhidos
        assertTrue(verifica.getNumeroDeAcertos() > 0);

        // Testando com um conjunto inválido de números escolhidos (tamanho fora do intervalo)
        numerosEscolhidos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)); // Tamanho maior que 15
        verifica = new VerificaAcertos(numerosEscolhidos, numerosSorteados);
        assertEquals(0, verifica.getNumeroDeAcertos().intValue());

        // Testando com um conjunto inválido de números escolhidos (valores fora do intervalo)
        numerosEscolhidos = new ArrayList<>(Arrays.asList(0, 61, 62));
        verifica = new VerificaAcertos(numerosEscolhidos, numerosSorteados);
        assertEquals(0, verifica.getNumeroDeAcertos().intValue());
    }

    @Test
    void testVerificaAcertosJogador() {
        ArrayList<Integer> numerosEscolhidos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> numerosSorteados = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        VerificaAcertos verifica = new VerificaAcertos(numerosEscolhidos, numerosSorteados);
        assertEquals(6, verifica.getNumeroDeAcertos().intValue());

        numerosEscolhidos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(5, verifica.getNumeroDeAcertos().intValue());

        numerosEscolhidos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 7));
        assertEquals(2, verifica.getNumeroDeAcertos().intValue());
    }
}