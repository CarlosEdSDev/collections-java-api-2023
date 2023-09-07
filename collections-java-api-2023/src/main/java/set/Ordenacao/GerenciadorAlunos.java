package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }
    public void removerAluno(long matricula){
        if(!alunoSet.isEmpty()){
            alunoSet.removeIf(aluno -> aluno.getMatricula().equals(matricula));
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunoSet);
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosCrescentes = new TreeSet<>(new ComparatorNota());
        alunosCrescentes.addAll(alunoSet);
        return alunosCrescentes;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Carlos", 1L,10);
        gerenciadorAlunos.adicionarAluno("Carlos Ed", 2L,5);
        gerenciadorAlunos.adicionarAluno("Carlos Doirde", 2L,10);
        gerenciadorAlunos.adicionarAluno("Caio", 3L,7);
        gerenciadorAlunos.adicionarAluno("Caaios", 4L,7);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(4L);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
