package main.java.set.Ordenacao;

import java.util.*;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod ,nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        return new TreeSet<>(produtoSet);
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosCrescente = new TreeSet<>(new ComparatorPreco());
        produtosCrescente.addAll(produtoSet);
        return produtosCrescente;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L,"Produto 1", 15d,5);
        cadastroProdutos.adicionarProduto(2L,"Produto 0", 26d,10);
        cadastroProdutos.adicionarProduto(3L,"Produto 2", 10d,2);
        cadastroProdutos.adicionarProduto(9L,"Produto 9", 2d,2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
