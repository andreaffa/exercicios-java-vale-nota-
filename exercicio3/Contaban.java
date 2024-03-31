package exercicio3;

public class Contaban {
    private String numero;
    private String nome;
    private double saldo;

    public Contaban(String numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("deposito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("saldo insuficiente para realizar o saque de R$" + valor + ".");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}