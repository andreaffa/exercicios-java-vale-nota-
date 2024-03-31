package exercicio4;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("deseja cadastrar um jogador? (S/N): ");
        String cadastro = leitor.next();

        Jogador cadastroplayer = null;

        if (cadastro.equalsIgnoreCase("S")) {
            System.out.print("informe o nome do jogador: ");
            String nome = leitor.next();

            System.out.print("informe a pontuacao inicial do jogador: ");
            int pontuacao = leitor.nextInt();

            System.out.print("informe o nivel inicial do jogador: ");
            int nivel = leitor.nextInt();

            cadastroplayer = new Jogador(nome, pontuacao, nivel);
            System.out.println("player cadastrado com sucesso");
        }else{
            System.out.println("vc escolheu nao cadastrar, encerrando...");
        }

        System.out.print("deseja realizar alguma operacao com o player cadastrado? (S/N): ");
        String operacao = leitor.next();

        if (operacao.equalsIgnoreCase("S")) {
            if (cadastroplayer != null) {
                System.out.println("escolha a operacao:");
                System.out.println("[1] aumentar pontuacao");
                System.out.println("[2] subir de nivel");
                System.out.println("[3] subir de nivel e pontuacao");
                int escolha = leitor.nextInt();

        
                switch (escolha) {
                    case 1:
                        System.out.print("informe a quantidade de pontos para adicioar: ");
                        int pontos = leitor.nextInt();
                        cadastroplayer.aumentarPontuacao(pontos);
                        break;
                    case 2:
                        cadastroplayer.subirNivel();
                        break;
                        case 3:
                        System.out.print("informe a quantidade de pontos para adicioar: ");
                        pontos = leitor.nextInt();

                        cadastroplayer.aumentarPontuacao(pontos);
                        cadastroplayer.subirNivel();
                        break;
                    default:
                        System.out.println("erro");
                }
            } else {
                System.out.println("nenhum jogador cadastrado.");
            }
        }

        if (cadastroplayer != null) {
            System.out.println("------------------------------");
            System.out.println("informacoes do player:");
            cadastroplayer.exibir();
        }

        leitor.close();
    }
}
