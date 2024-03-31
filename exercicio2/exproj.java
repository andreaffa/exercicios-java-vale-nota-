package exercicio2;

import java.util.Scanner;

public class exproj {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("deseja fazer cadastro de um livro? (S/N): ");
        String cadastro = leitor.next();

        Biblioteca livroCadastrado = null;

        if (cadastro.equalsIgnoreCase("S")) {
            System.out.print("informe o titulo do livro: ");
            String titulo = leitor.next();

            System.out.print("informe o nome do autor: ");
            String autor = leitor.next();

            System.out.print("informe o ano de publicação: ");
            int ano = leitor.nextInt();

            livroCadastrado = new Biblioteca(titulo, autor, ano);
            System.out.println("livro cadastrado com sucesso!");
        }else{
            System.out.println("vc escolheu nao cadastrar, encerrando...");
        }

        System.out.print("deseja ver as informações do livro cadastrado? (S/N): ");
        String info = leitor.next();

        if (info.equalsIgnoreCase("S")) {
            if (livroCadastrado != null) {
                livroCadastrado.cadastro();
            } else {
                System.out.println("nenhum livro cadastrado.");
            }
        }

        leitor.close();
    }
}