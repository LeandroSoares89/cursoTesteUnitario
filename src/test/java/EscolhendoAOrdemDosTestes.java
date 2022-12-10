/*Classe para demonstrar como é feita a ordenação de testes*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/*
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 Usando a anotação @Order nos metodos de teste para determinar as ordens que os testes seram executados
---------------------------------------------------------------------------------------------------------
@TestMethodOrder(MethodOrderer.MethodName.class)
Executa os testes conforme o nome dos teste respeitando a ordem alfabetica.
---------------------------------------------------------------------------------------------------------
@TestMethodOrder(DisplayName.class)
Usando a anotação @DisplayName() passando o nome do metodo  e respeitando a ordem alfabetica.
*/
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemDosTestes {

//    @Order(4)
    @DisplayName("A")
    @Test
    void validTestA(){
        assertTrue(true);
    }

//    @Order(3)
    @DisplayName("B")
    @Test
    void validTestB(){
        assertTrue(true);
    }

//    @Order(2)
    @DisplayName("C")
    @Test
    void validTestC(){
        assertTrue(true);
    }

//    @Order(1)
    @DisplayName("D")
    @Test
    void validTestD(){
        assertTrue(true);
    }
}
