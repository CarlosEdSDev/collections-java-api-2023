package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }
    public void setNumeroList(List<Integer> numeroList) {
        this.numeroList = numeroList;
    }

    public void adicionarNumero(int numero)  {

        numeroList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(numeroList);
        if (!numeroList.isEmpty()){
            Collections.sort(numerosAscendentes);
        }
        return numerosAscendentes;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(numeroList);
        if (!numeroList.isEmpty()){
            numerosDescendentes.sort(Collections.reverseOrder());
        }
        return numerosDescendentes;
    }
    @Override
    public String toString() {
        return "Numeros: " +
                  numeroList ;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(2);

        System.out.println(ordenacaoNumeros);
        ordenacaoNumeros.setNumeroList(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros);
        ordenacaoNumeros.setNumeroList(ordenacaoNumeros.ordenarDescendente());
        System.out.println(ordenacaoNumeros);


    }

}
