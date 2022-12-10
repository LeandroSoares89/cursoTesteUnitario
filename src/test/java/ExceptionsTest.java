import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarExceptionTranferenciaEntreContas(){
        Conta ctOrigem = new Conta(1,1);
        Conta ctDestino = new Conta(1,2);

        assertThrows(IllegalArgumentException.class, () ->
            ctOrigem.transferenciaEntreContas(ctOrigem,ctDestino,-10));
    }
    @Test
    void validarNotExceptionTranferenciaEntreContas(){
        Conta ctOrigem = new Conta(1,1);
        Conta ctDestino = new Conta(1,2);

        assertDoesNotThrow(() -> ctOrigem.transferenciaEntreContas(ctOrigem,ctDestino,10));
    }
    @Test
    void valicarTransferenciaEntreContas(){
        Conta ctOrigem = new Conta(1,1);
        Conta ctDestino = new Conta(1,2);

        ctOrigem.transferenciaEntreContas(ctOrigem,ctDestino,10);
        assertEquals(-10, ctOrigem.getSaldo());
        assertEquals(10, ctDestino.getSaldo());

    }
}
