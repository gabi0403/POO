package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import model.Professor;

public class CursoController {
    // classe que vai realizar a interação entre os modelos
    // e a interface view
    //atributos
    private String nomeCurso;
    private Professor professor; //instanciar um obj da classe professor
    private List<Aluno> alunosList;
    
    //métodos
    //ctor
    //na criação do curso, deve-se passar o nome do curso
    // e o professor do curso
    public CursoController(String nomeCurso, Professor professor){
        this.nomeCurso = nomeCurso;
        this.professor = professor;
        this.alunosList = new ArrayList<>();//vetor de objetos Alunos
    }

    //crud
    //adicionar um aluno (Create)
    public void adicionarAluno (Aluno aluno){
        alunosList.add(aluno);
    }

    //exibirCurso(read)
    public void infoCurso(){
        System.out.println("Nome Curso: "+nomeCurso);
        System.out.println("Professor: "+professor.getNome());
        System.out.println("============================");
        //imprimir a lista de alunos
        for (Aluno aluno : alunosList) {
            System.out.println(aluno.getNome());
        }
        System.out.println("============================");
    }

    //update (lançar notas)
    // lançar nota de aluno por aluno já cadastrado
    public void notaAlunos(){
        //colocar o scanner aqui
        Scanner sc = new Scanner(System.in);//ler o terminal
        for (Aluno aluno : alunosList) {
            System.out.println("Informe a Nota do Aluno "+aluno.getNome());
            aluno.setNota(sc.nextDouble());
        }
    }
    //ver notas dos alunos
    public void statusCurso(){
        System.out.println("Nome Curso: "+nomeCurso);
        System.out.println("Professor: "+professor.getNome());
        System.out.println("============================");
        //imprimir a lista de alunos
        for (Aluno aluno : alunosList) {
            System.out.println(aluno.getNome()+" - nota: "+aluno.getNota());
        }
        System.out.println("============================");
    }

    //delete

}