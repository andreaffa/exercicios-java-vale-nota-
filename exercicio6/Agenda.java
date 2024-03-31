package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("contato adicionado!");
    }

    public void removerContato(String nome) {
        Contato Remover = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                Remover = contato;
                break;
            }
        }
        if (Remover != null) {
            contatos.remove(Remover);
            System.out.println("contato removido!");
        } else {
            System.out.println("contato nao encontrado.");
        }
    }

    public void buscarContato(String nome) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("contato encontrado: " + contato);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("contato nao encontrado.");
        }
    }
}
