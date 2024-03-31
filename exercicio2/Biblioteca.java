package exercicio2;

public class Biblioteca {

    String titulo;
    String autor;
    int ano;

    public Biblioteca(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void cadastro() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("ano de publicação: " + ano);
    }
}