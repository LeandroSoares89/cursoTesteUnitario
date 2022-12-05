import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondicionaisTest {

    @Test
    //Só funciona se rodar a classe inteira de testes.
    @EnabledIfEnvironmentVariable(named ="USERNAME", matches = "Testolino")
    void validarAlgoSomenteNoUsuairoTestolino(){
        System.out.println(System.getenv("USERNAME"));
        assertEquals(10, 5 + 5);
    }
}
