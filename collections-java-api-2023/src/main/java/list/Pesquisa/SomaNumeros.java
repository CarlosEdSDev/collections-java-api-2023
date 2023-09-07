package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;



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
            int encontrarMaior= 0;
            boolean fist = true;
            for(Integer n:numeroList){
                if(fist){
                    encontrarMaior = n;
                    fist = false;
                }else {
                if(encontrarMaior< n){
                        encontrarMaior= n;
                    }
                }
            }
            return encontrarMaior;
        }
       return 0;
    }
    public int encontrarMenorNumero(){
        if(!numeroList.isEmpty()){
            int encontrarMenor= 0;
            boolean fist = true;
            for(Integer n:numeroList){
                if(fist){
                    encontrarMenor = n;
                    fist = false;
                }else {
                    if(encontrarMenor> n){
                        encontrarMenor= n;
                    }
                }
            }
            return encontrarMenor;
        }
        return 0;
    }

    public void exibirNumeros(){
        if(!numeroList.isEmpty()) {
            System.out.print("Numeros: ");
            for (Integer n: numeroList){
                System.out.print(n+" ");
            }
        }else{System.out.println("Lista vazia");}
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(9);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(14);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(13);

        System.out.println("Encontrar Maior numero: "+numeros.encontrarMaiorNumero());

        numeros.adicionarNumero(7);

        System.out.println("Encontrar Menor numero: "+numeros.encontrarMenorNumero());

        System.out.println("Somar Todos os numero: "+numeros.calcularSoma());

        numeros.exibirNumeros();


    }

}

