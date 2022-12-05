import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Pessoa {
    private String nome;
    private LocalDate dtNascimento;
    private int idade;

    public Pessoa(String nome, LocalDate dtNascimento) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(dtNascimento, LocalDate.now());
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean ehMaiorDeIdade(){
        return  this.getIdade() >= 18;
    }
}
