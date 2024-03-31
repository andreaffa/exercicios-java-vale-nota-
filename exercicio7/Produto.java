package exercicio7;

public class Produto {
    private String nome;
    private int codigo;
    private int preco;
    private int estoque;

    public Produto(String nome, int codigo, int preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
        System.out.println(quantidade + " unidades do produto " + nome + " adicionadas ao estoque.");
    }

    public void atualizarPreco(int novopreco) {
        preco = novopreco;
        System.out.println("preco do produto " + nome + " atualizado para R$" + preco);
    }

    public void removerEstoque(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
            System.out.println(quantidade + " unidades do produto " + nome + " removidas do estoque.");
        } else {
            System.out.println("nao tem " + quantidade + " unidades do produto " + nome + " em estoque para remover.");
        }
    }

    public double calcularValorTotal() {
        return preco * estoque;
    }

    public void exibir() {
        System.out.println("nome: " + nome);
        System.out.println("codigo do produto: " + codigo);
        System.out.println("preco: R$" + preco);
        System.out.println("quantidade em estoque: " + estoque);
        System.out.println("valor total em estoque: R$" + calcularValorTotal());
    }
}
