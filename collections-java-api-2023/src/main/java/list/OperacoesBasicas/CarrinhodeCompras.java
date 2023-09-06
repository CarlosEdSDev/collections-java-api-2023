package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private List<Item> itemList;

    public CarrinhodeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensToRemove = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i: itemList) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensToRemove.add(i);
                }
            }
            itemList.removeAll(itensToRemove);
        }else{
            System.out.println("Lista Vazia");
        }
    }
    public double calcularValorTotal(){
        if (!itemList.isEmpty()){
            double valorTotal=0d;
            for(Item i: itemList){
                valorTotal=valorTotal+(i.getPreco()* i.getQuantidade());
            }
            return valorTotal;
        }else{
            System.out.println("Lista Vazia");
            return 0;
        }

    }
    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(itemList);
        }else{
            System.out.println("Lista Vazia");
        }

    }

    public static void main(String[] args) {
        CarrinhodeCompras CarinhodeCompras = new CarrinhodeCompras();
        CarinhodeCompras.exibirItens();
        CarinhodeCompras.adicionarItem("pão",3d,2);
        CarinhodeCompras.adicionarItem("100g queijo",1d,1);
        CarinhodeCompras.adicionarItem("100g presunto",1d,1);

        CarinhodeCompras.exibirItens();

        CarinhodeCompras.removerItem("100g queijo");
        CarinhodeCompras.exibirItens();

        System.out.println("Total das compras: "+CarinhodeCompras.calcularValorTotal());

    }



}
