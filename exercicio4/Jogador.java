package exercicio4;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao(int pontos) {
        pontuacao += pontos;
        System.out.println("------------------------------");
        System.out.println("pontuacao aumentada\nnova pontuacao de " + nome + ": " + pontuacao);
    }

    public void subirNivel() {
        nivel++;
        System.out.println("o player " + nome + " subiu para o nivel " + nivel);
    }

    public void exibir() {
        System.out.println("nome: " + nome);
        System.out.println("pontuacao: " + pontuacao);
        System.out.println("level: " + nivel);
    }
}
