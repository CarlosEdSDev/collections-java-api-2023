package main.java.map.OperacaoBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
     private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome= null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila",1234);
        agendaContatos.adicionarContato("Camilas",1204);
        agendaContatos.adicionarContato("Camila Cavalcante",1232);
        agendaContatos.adicionarContato("Camila 010",1235);
        agendaContatos.adicionarContato("Maria",4321);

        agendaContatos.removerContato("Camilas");
        agendaContatos.exibirContatos();
        System.out.println("o numero e: "+agendaContatos.pesquisarPorNome("Camila"));
        agendaContatos.exibirContatos();
    }
}
