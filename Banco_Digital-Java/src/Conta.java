public abstract class Conta {
    
    // CONSTANTES
    
    protected static final int AGENCIA_PADRAO = 1; // Constante para agência padrão
    // 'protected' para que subclasses possam acessar, mas não de fora do pacote
    private static int SEQUENCIAL = 1; // Sequencial para número da conta corrente
    // 'static' para que o número da conta seja compartilhado entre todas as instâncias

    // ATRIBUTOS
    protected int agencia; // 'private' para encapsulamento, 'protected' se subclasses precisarem acessar
    protected int numero;
    protected int saldo;

    

    public Conta() {
        // Construtor específico para ContaCorrente
        // Inicialização de atributos específicos, se necessário
        this.agencia = AGENCIA_PADRAO;
        this.numero =  SEQUENCIAL++;
    }



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
