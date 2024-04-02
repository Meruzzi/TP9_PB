package org.example;


public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(345345, "Gabriel");
        Turma turma1 = new Turma(3143);
        Professor professor1 = new Professor(2134, "Kleber");
        Disciplina disciplina1 = new Disciplina(2314, "Java");

        turma1.setDisciplina(disciplina1);
        turma1.setProfessor(professor1);

        professor1.setTurma(turma1);
        disciplina1.setTurma(turma1);

        aluno1.AdicionarTurma(aluno1, turma1);
        aluno1.exibirTurmas();
    }
}