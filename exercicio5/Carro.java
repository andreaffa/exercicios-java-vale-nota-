package exercicio5;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("o carro esta acelerando,a nova velocidade: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
            System.out.println("o carro esta freiando,a nova velocidade: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("o carro ja esta parado.");
        }
    }

    public void exibir() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("placa: " + placa);
        System.out.println("velocidade atual: " + velocidadeAtual + " km/h");
    }
}
