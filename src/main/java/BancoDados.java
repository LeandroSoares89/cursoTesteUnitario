import java.util.ArrayList;
import java.util.logging.Logger;

public class BancoDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());
    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void iniciarConexao(){
        LOGGER.info("Iniciou a conexão");
    }

    public static void inserirDados(Pessoa pessoa){
        //Insere Pessoas
        pessoas.add(pessoa);
        LOGGER.info("Inseriu a Pessoa com o nome: " + pessoa.getNome() +"\n idade: " + pessoa.getIdade() +
                " \n e data de nascimento: " + pessoa.getDtNascimento());
    }

    public static void deletarTodosDados(){
        pessoas.removeAll(pessoas);
        LOGGER.info("Banco Vazio: " + pessoas);
    }
     
    public static void fechouConexao(){
        LOGGER.info("Fechou Conexão");
    }
}
