package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public Double calcularValorTotalEstoque() {
        Double valorTotal = null;
        if (!estoqueProdutoMap.isEmpty()) {
            valorTotal = 0d;
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutoMap.values()) {
            if (maiorPreco < p.getPreco()) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }

        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutoMap.values()) {
            if (menorPreco > p.getPreco()) {
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }

        }
        return produtoMaisBarato;
    }

    public Produto MaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidade = null;
        double maiorQuantidade = Double.MIN_VALUE;
        for (Produto p : estoqueProdutoMap.values()) {
            if (maiorQuantidade < (p.getPreco() * p.getQuantidade())) {
                maiorQuantidade = p.getPreco() * p.getQuantidade();
                produtoMaiorQuantidade = p;
            }

        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto A", 5, 2.0);
        estoqueProdutos.adicionarProduto(3L, "Produto A", 2, 15.0);

        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total do Estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto Mais Caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto Mais Barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto de maior quantidade por preco: " + estoqueProdutos.MaiorQuantidadeValorTotalNoEstoque());

    }
}
