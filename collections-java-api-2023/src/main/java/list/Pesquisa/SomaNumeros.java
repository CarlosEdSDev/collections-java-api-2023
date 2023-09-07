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
    }public int encontrarMaiorNumero(){
        if(!numeroList.isEmpty()){
            Optional<Integer> maior= numeroList.stream().findAny() ;
            for(Integer n:numeroList){
                if(maior){

                }

                }
            }

        }
        return maior;
    }
}
