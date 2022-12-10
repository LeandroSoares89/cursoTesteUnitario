public class Conta {
    private int agencia;
    private int numero ;
    private double saldo = 0f;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferenciaEntreContas(Conta contaOrigem, Conta contaDestino, double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        contaOrigem.saldo = contaOrigem.saldo - valor;
        contaDestino.saldo= contaDestino.saldo + valor;



    }
}
