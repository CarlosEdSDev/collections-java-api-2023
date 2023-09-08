package main.java.map.Ordenacao;

public class Evento {
    private String nome;
    private String evento;

    public Evento(String nome, String evento) {
        this.nome = nome;
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Evento{" + nome + " | " + evento+ '}';
    }

    public String getEvento() {
        return evento;
    }
}
