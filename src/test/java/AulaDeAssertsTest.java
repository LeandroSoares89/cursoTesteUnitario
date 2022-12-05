import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class AulaDeAssertsTest {

    @Test
    void validarSeVetoresSaoIguais(){
       int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
       int[] segundoLancamento = { 10, 20, 30, 40, 50 };
       assertArrayEquals(primeiroLancamento, segundoLancamento);
    }
    @Test
    void validarSeObjetoEstaoNulo(){
        Pessoa p = null;
        assertNull(p);
    }
    @Test
    void validarSeObjetoNaoEstaNulo(){
       Pessoa p = new Pessoa("Nulentino", LocalDate.now());
       assertNotNull(p);

    }
    @Test
    void validarTiposNumericos(){
        double d1 = 5.0;
        double d2 = 5.0;
        int i1 = 6;
        int i2 = 6;
        float f1 =3f;
        float f2 = 3f;
        assertEquals(d1,d2);
        assertEquals(i1,i2);
        assertEquals(f1,f2);
    }
}
