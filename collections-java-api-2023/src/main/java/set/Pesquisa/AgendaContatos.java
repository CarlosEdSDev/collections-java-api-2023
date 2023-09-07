package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoParaPesquisa = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for (Contato c:contatoSet) {
                if(c.getNome().startsWith(nome)){
                    contatoParaPesquisa.add(c);
                }
            }
        }
        return contatoParaPesquisa;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }else {
            System.out.println("Lista Vazia");
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila",1234);
        agendaContatos.adicionarContato("Camila",1204);
        agendaContatos.adicionarContato("Camila Cavalcante",1232);
        agendaContatos.adicionarContato("Camila 010",1235);
        agendaContatos.adicionarContato("Maria",4321);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Maria", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        agendaContatos.exibirContatos();
    }


}
