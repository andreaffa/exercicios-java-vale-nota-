package exercicio6;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Agenda agenda = new Agenda();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nescolha a operacao:");
            System.out.println("[1] adicionar Ccntato");
            System.out.println("[2] remover contato");
            System.out.println("[3] buscar contato");
            System.out.println("[4] sair");
            System.out.print("opcao: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("informe o nome do contato: ");
                    String nomeAdd = leitor.next();
                    System.out.print("informe o telefone do contato: ");
                    String telefoneAdd = leitor.next();
                    Contato novoContato = new Contato(nomeAdd, telefoneAdd);
                    agenda.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.print("informe o nome do contato a ser removido: ");
                    String nomeRemover = leitor.next();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.print("informe o nome do contato a ser buscado: ");
                    String nomeBuscar = leitor.next();
                    agenda.buscarContato(nomeBuscar);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("encerrando...");
                    break;
                default:
                    System.out.println("erro.");
            }
        }

        leitor.close();
    }
}
