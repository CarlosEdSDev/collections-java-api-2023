package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SomaNumeros {
    List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        if(!numeroList.isEmpty()){
            for(Integer n:numeroList){
                soma+=n;
            }

        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        if(!numeroList.isEmpty()){
            int maior= 0;
            boolean fist = true;
            for(Integer n:numeroList){
                if(fist == true){
                    maior = n;
                    fist = false;
                }else {
                if(maior< n){
                        maior= n;
                    }else { maior = maior;}
                }
            }
            return maior;
        }
       return 0;
    }

    public String toString() {
        return "SomaNumeros{" +
                "numeroList=" + numeroList +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros n = new SomaNumeros();
        n.adicionarNumero(9);
        n.adicionarNumero(10);
        n.adicionarNumero(14);
        n.adicionarNumero(8);
        n.adicionarNumero(13);
        System.out.println("Maior: "+n.encontrarMaiorNumero());
        System.out.println("Soma: "+n.calcularSoma());

    }

}

