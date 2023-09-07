package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String Nome;
    private Long matricula;
    private Double nota;

    public Aluno(String nome, Long matricula, Double media) {
        Nome = nome;
        this.matricula = matricula;
        this.nota = media;
    }

    public String getNome() {
        return Nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Aluno o) {
        return Nome.compareToIgnoreCase(o.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" + Nome +" | "+ matricula +" | "+ nota + '}';
    }
}
class ComparatorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(),o2.getNota());
    }
}
