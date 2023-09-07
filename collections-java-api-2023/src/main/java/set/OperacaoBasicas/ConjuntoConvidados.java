package main.java.set.OperacaoBasicas;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem: "+ conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Jão", 1000);
        conjuntoConvidados.adicionarConvidado("Paulo",2000);
        conjuntoConvidados.adicionarConvidado("Joca",3000);
        conjuntoConvidados.adicionarConvidado("Joca1",3000);
        conjuntoConvidados.adicionarConvidado("jerson",4000);

        System.out.println("Existem: "+ conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2000);
        System.out.println("Existem: "+ conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }
}
