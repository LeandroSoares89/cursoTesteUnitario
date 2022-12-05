import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaDadosDePessoaTest {

    Pessoa pessoaTest = new Pessoa("Testonildo", LocalDate.of(1995, 5, 28));

    @BeforeAll
    static void configuraConexao(){
        BancoDados.iniciarConexao();
    }

    @BeforeEach
    void inseriPessoa(){
        BancoDados.inserirDados(pessoaTest);
    }
    @Test
    void validarDadosDeRetorno(){
        assertEquals("Testonildo", pessoaTest.getNome());
        assertEquals(LocalDate.of(1995,5,28), pessoaTest.getDtNascimento());
        assertEquals(27,pessoaTest.getIdade());
    }

    @Test
    void validarSePessoaEhMaiorIdade(){
        assertTrue(pessoaTest.ehMaiorDeIdade());
    }

    @AfterEach
    void removePessoa(){
        BancoDados.deletarTodosDados();
    }

    @AfterAll
    static void fechaConexao(){
        BancoDados.fechouConexao();
    }
}
