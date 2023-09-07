package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String Nome;
    private int numero;

    public Contato(String nome, int numero) {
        Nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato {" +  Nome + "|" + numero + "}";
    }
}
