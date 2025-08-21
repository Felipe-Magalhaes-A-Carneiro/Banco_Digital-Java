public abstract class Conta {
    
    // ATRIBUTOS
    private int agencia;
    private int numero;
    private int saldo;

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // CONSTRUTOR (Método especial para inicializar objetos)
    public void sacar() {

    }
    public void depositar() {

    }
    public void transferir() {

    }

    // getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

}
