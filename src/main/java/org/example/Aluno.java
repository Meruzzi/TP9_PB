package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int Matricula;
    private String Nome;
    private List<Turma> turmas;

    public Aluno(int matricula, String nome) {
        this.Matricula = matricula;
        this.Nome = nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        this.Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void AdicionarTurma(Aluno aluno, Turma turma) {
        if(turmas == null) {
            turmas = new ArrayList<>();
            turmas.add(turma);
            turma.addAluno(aluno);
            System.out.println("Aluno adicionado");
        } else {
            turmas.add(turma);
            turma.addAluno(aluno);
            System.out.println("Aluno adicionado");
        }
    }

    public void exibirTurmas() {
        for (Turma turma : turmas) {
            System.out.println(turma.getCodigo());
        }
    }
}
