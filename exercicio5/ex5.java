package exercicio5;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("deseja cadastrar um carro? (S/N): ");
        String cadastro = leitor.next();

        Carro carroCadastrado = null;

        if (cadastro.equalsIgnoreCase("S")) {
            System.out.print("qual a marca do carro: ");
            String marca = leitor.next();

            System.out.print("qual o modelo do carro: ");
            String modelo = leitor.next();

            System.out.print("qual e o ano do carro: ");
            int ano = leitor.nextInt();

            System.out.print("qual a placa do carro: ");
            String placa = leitor.next();

            System.out.print("informe a velocidade atual do carro: ");
            int velocidadeAtual = leitor.nextInt();

            carroCadastrado = new Carro(marca, modelo, ano, placa, velocidadeAtual);
            System.out.println("carro cadastrado!");
        }else{
            System.out.println("vc escolheu nao cadastrar, encerrando...");
        }

        System.out.print("deseja realizar alguma operacao com o carro? (S/N): ");
        String operacao = leitor.next();

        if (operacao.equalsIgnoreCase("S")) {
            if (carroCadastrado != null) {
                System.out.println("escolha a operacao:");
                System.out.println("[1] acelerar");
                System.out.println("[2] freiar");
                int escolha = leitor.nextInt();

                switch (escolha) {
                    case 1:
                        carroCadastrado.acelerar();
                        break;
                    case 2:
                        carroCadastrado.frear();
                        break;
                    default:
                        System.out.println("ppcao invalida.");
                }
            } else {
                System.out.println("nenhum carro cadastrado.");
            }
        }

        if (carroCadastrado != null) {
            System.out.println("informacao do carro:");
            carroCadastrado.exibir();
        }

        leitor.close();
    }
}
