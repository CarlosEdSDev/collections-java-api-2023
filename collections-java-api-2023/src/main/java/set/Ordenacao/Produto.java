package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long cod;

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod,String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    public long getCod() {
        return cod;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + nome + ' ' + " | " + preco + " | " + quantidade + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}
class ComparatorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}
