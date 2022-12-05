import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuairoTestolino(){
        Assumptions.assumeTrue("Testolino".equals(System.getenv("USERNAME")));
        assertEquals(10, 5 + 5);
    }
}
