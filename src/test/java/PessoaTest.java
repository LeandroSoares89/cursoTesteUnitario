import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDaIdade(){
        Pessoa p = new Pessoa("Ana", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(2,p.getIdade());
    }
    @Test
    void validarSeEhMaiorDeIdade(){
        Pessoa p = new Pessoa("João", LocalDate.of( 1989,3,18));
        Assertions.assertTrue(p.ehMaiorDeIdade());
    }
    @Test
    void ValidarSeNaoEhmaiorDeIdade(){
        Pessoa p = new Pessoa("João", LocalDate.of( 2020,3,18));
        Assertions.assertFalse(p.ehMaiorDeIdade());
    }
}
