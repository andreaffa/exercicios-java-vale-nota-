package exercicio3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("gostaria de cadastrar uma conta bancária? (S/N): ");
        String cadastro = leitor.next();

        Contaban contaCadastrada = null;

        if (cadastro.equalsIgnoreCase("S")) {
            System.out.print("Informe o número da conta: ");
            String num = leitor.next();

            System.out.print("Informe o nome do titular: ");
            String nome = leitor.next();

            System.out.print("Informe o saldo inicial: ");
            double saldoini = leitor.nextDouble();

            contaCadastrada = new Contaban(num, nome, saldoini);
            System.out.println("Conta bancária cadastrada com sucesso!");
        }else{
            System.out.println("vc escolheu nao cadastrar, encerrando...");
        }

        System.out.print("gostaria de realizar uma operação na conta cadastrada? (S/N): ");
        String operacao = leitor.next();

        if (operacao.equalsIgnoreCase("S")) {
            if (contaCadastrada != null) {
                System.out.println("escolha a operação:");
                System.out.println("[1] deposito");
                System.out.println("[2] saque");
                int escolha = leitor.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.print("informe o valor do deposito: ");
                        double deposito = leitor.nextDouble();
                        contaCadastrada.depositar(deposito);
                        break;
                    case 2:
                        System.out.print("informe o valor do saque: ");
                        double saque = leitor.nextDouble();
                        contaCadastrada.sacar(saque);
                        break;
                    default:
                        System.out.println("perdeu playboy");
                }
            } else {
                System.out.println("nenhuma conta cadastrada.");
            }
        }

        if (contaCadastrada != null) {
            System.out.println("saldo atual da conta: R$" + contaCadastrada.getSaldo());
        }

        leitor.close();
    }
}
