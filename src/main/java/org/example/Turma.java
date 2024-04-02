package org.example;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private List<Aluno> alunos;
    private Professor professor;
    private  Disciplina disciplina;

    public Turma(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void addAluno(Aluno aluno) {
        if(alunos == null) {
            alunos = new ArrayList<>();
            alunos.add(aluno);
            System.out.println("Aluno adicionado");
        } else {
            alunos.add(aluno);
            System.out.println("Aluno adicionado");
        }
    }

    public boolean abrirTurma() {
        if (alunos.size() > 1 && alunos.size() < 11) {
            return true;
        } else {
            return false;
        }
    }

    public void gerarPauta() {
        System.out.println(professor.getNome());
        System.out.println(disciplina.getNome());
        for(Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
