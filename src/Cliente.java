// Arquivo: src/Cliente.java
public class Cliente {
    private String nome;
    private ContaBancaria conta;

    // Construtor da classe Cliente
    public Cliente(String nome, ContaBancaria conta) {
        this.nome = nome;
        this.conta = conta;
    }

    // Método para realizar um depósito na conta do cliente
    public void realizarDeposito(double valor) {
        conta.depositar(valor);
    }

    // Método para realizar um saque na conta do cliente
    public void realizarSaque(double valor) {
        conta.sacar(valor);
    }

    // Método para exibir informações do cliente e sua conta
    public void exibirInformacoesCliente() {
        System.out.println("Nome do Cliente: " + nome);
        conta.exibirInformacoes();
    }
}
