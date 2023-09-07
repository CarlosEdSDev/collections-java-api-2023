package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private final String descricao;
    private boolean ready;

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.ready = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isReady() {
        return ready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public String toString() {
        String estado;
        if(ready){
            estado ="Concluida";
        }else{
            estado = "Pendente";
        }
        return "Tarefa{" + descricao + " | " + estado + '}';
    }
}
