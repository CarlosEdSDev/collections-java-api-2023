package main.java.set.OperacaoBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = "";
        for (String p : palavrasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            for (String p: palavrasSet) {
                if (p.equalsIgnoreCase(palavra)) {
                    System.out.println("Palavra Unica: " + p + " Esta presente");
                    break;
                }
            }
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavrasSet, that.palavrasSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Batata");
        palavrasUnicas.adicionarPalavra("Batata");
        palavrasUnicas.adicionarPalavra("Batatinha");
        palavrasUnicas.adicionarPalavra("Batatão");
        palavrasUnicas.adicionarPalavra("Batatoso");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Batatoso");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.verificarPalavra("Batatão");



    }

}
