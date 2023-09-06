package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefalist.isEmpty()){
            for (Tarefa t: tarefalist) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                       tarefasParaRemover.add(t);
                }
            }
            tarefalist.removeAll(tarefasParaRemover);
        }else{
            System.out.println("A lista esta vazia");
        }
    }
    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa ListaTarefa = new ListaTarefa();
        System.out.println("Elementos listas: "+ListaTarefa.obterNumeroTotalTarefas());
        ListaTarefa.adicionarTarefa("Tarefa1");
        ListaTarefa.adicionarTarefa("Tarefa2");
        ListaTarefa.adicionarTarefa("Tarefa2");

        System.out.println("Elementos listas: "+ListaTarefa.obterNumeroTotalTarefas());

        ListaTarefa.removerTarefa("Tarefa1");
        System.out.println("Elementos listas: "+ListaTarefa.obterNumeroTotalTarefas());

        ListaTarefa.obterDescricoesTarefas();
    }
}
