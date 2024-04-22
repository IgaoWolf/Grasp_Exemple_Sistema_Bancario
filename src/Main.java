// Arquivo: src/Main.java
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345", 0000.0);
        Cliente cliente1 = new Cliente("João", conta1);

        cliente1.realizarDeposito(400.0);
        cliente1.realizarSaque(200.0);
        cliente1.exibirInformacoesCliente();
    }
}
