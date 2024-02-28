import org.example.NumerosSorteados;
import org.testng.annotations.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class NumerosSorteadosTest {

    @Test
    public void testSorteiaNumerosVencedores() {
        NumerosSorteados sorteio = new NumerosSorteados();
        ArrayList<Integer> numeros = sorteio.getNumerosSorteados();


        assertEquals(6, numeros.size(), "O tamanho da lista de números sorteados deve ser 6");


        assertTrue(numeros.stream().allMatch(n -> n >= 1 && n <= 60), "Todos os números devem estar no intervalo de 1 a 60");

        assertEquals(numeros.size(), (int) numeros.stream().distinct().count(), "A lista de números sorteados não deve conter duplicatas");
    }
}