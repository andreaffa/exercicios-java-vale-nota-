package exercicio7;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("deseja adicionar um produto ao estoque? (s/n): ");
        String add = leitor.next();

        Produto produto = null;

        if (add.equalsIgnoreCase("S")) {
            System.out.print("informe o nome do produto: ");
            String nome = leitor.next();

            System.out.print("informe o codigo do produto: ");
            int codigo = leitor.nextInt();

            System.out.print("informe o preco do produto: ");
            int preco = leitor.nextInt();

            System.out.print("informe a quantidade em estoque do produto: ");
            int quantidade = leitor.nextInt();

            produto = new Produto(nome, codigo, preco, quantidade);
            System.out.println("produto adicionado");
        }else{
            System.out.println("vc escolheu nao cadastrar, encerrando...");
        }

        System.out.print("deseja realizar alguma operacao com o produto? (s/n): ");
        String op = leitor.next();

        if (op.equalsIgnoreCase("s")) {
            if (produto != null) {
                System.out.println("escolha a operacaoo:");
                System.out.println("[1] atualizar preco");
                System.out.println("[2] adicionar ao estoque");
                System.out.println("[3] remover do estoque");
                int escolha = leitor.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.print("informe o novo preço: ");
                        int novopreco = leitor.nextInt();
                        produto.atualizarPreco(novopreco);
                        break;
                    case 2:
                        System.out.print("informe a quantidade a ser adicionada ao estoque: ");
                        int quantidadeAdicionar = leitor.nextInt();
                        produto.adicionarEstoque(quantidadeAdicionar);
                        break;
                    case 3:
                        System.out.print("informe a quantidade a ser removida do estoque: ");
                        int remover = leitor.nextInt();
                        produto.removerEstoque(remover);
                        break;
                    default:
                        System.out.println("opcao invalida.");
                }
            } else {
                System.out.println("nenhum produto cadastrado.");
            }
        }

        if (produto != null) {
            System.out.println("informacoes do produto:");
            produto.exibir();
        }

        leitor.close();
    }
}
