// Arquivo: src/ContaBancaria.java
public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    // Construtor da classe ContaBancaria
    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
}
