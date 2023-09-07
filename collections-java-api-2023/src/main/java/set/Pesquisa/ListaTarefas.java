package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private final Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTareda(String descricao){
        if(!tarefaSet.isEmpty()){
            tarefaSet.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
        }
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public void contarTarefas(){
        System.out.println("São "+tarefaSet.size()+" tarefas");
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(t.isReady()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }public Set<Tarefa> obterTarefasPendetes(){
        Set<Tarefa> tarefasPendetes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(!t.isReady()){
                    tarefasPendetes.add(t);
                }
            }
        }
        return tarefasPendetes;
    }
    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setReady(true);
                    break;
                }
            }
        }
    }
    public void marcarTarefaPendete(String descricao){
        if(!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setReady(false);
                    break;
                }
            }
        }
    }
    public void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){

            tarefaSet.removeAll(tarefaSet);
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("fazer exercicio 1");
        listaTarefas.adicionarTarefa("fazer exercicio 2");
        listaTarefas.adicionarTarefa("fazer exercicio 3");
        listaTarefas.adicionarTarefa("fazer exercicio 4");
        listaTarefas.adicionarTarefa("fazer exercicio 5");

        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("fazer exercicio 3");
        listaTarefas.marcarTarefaConcluida("fazer exercicio 4");
        listaTarefas.marcarTarefaConcluida("fazer exercicio 5");

        System.out.println(listaTarefas.obterTarefasPendetes());
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendete("fazer exercicio 5");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.removerTareda("fazer exercicio 5");

        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();



    }

}
