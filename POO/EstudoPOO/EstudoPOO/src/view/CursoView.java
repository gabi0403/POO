package View;

import java.util.Scanner;

import Controller.CursoController;
import model.Aluno;
import model.Professor;

public class CursoView {
    //atributo
    //instanciar obj de professor
    Professor jp = new Professor("João Pereira", "123.456", "10/10/1910", 15000.00);
    //instaciar obj de CursoController
    CursoController cursoJava = new CursoController("Programação Java", jp);


    //métodos view ( Tela interativa CLI)
    int operacao; // escolher a ação
    boolean continuar = true; // continuar com a ação
    Scanner sc = new Scanner(System.in); // entrada de dados

    public void menu(){
        while (continuar) {
            System.out.println("==Gerenciamento de Curso==");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Informação do Curso");
            System.out.println("3. Lançar Nota dos Alunos");
            System.out.println("4. Status da Turma");
            System.out.println("5. Sair");
            System.out.println("==Escolha Opção Desejada==");
            operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    Aluno aluno = cadastrarAluno();
                    cursoJava.adicionarAluno(aluno);
                    break;
                case 2:
                    cursoJava.infoCurso();//exibir info
                    break;
                case 3:
                    cursoJava.lancarNotas();

                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informe um Opção Válida");
                    break;
            }
        }
    }

    private Aluno cadastrarAluno() {
        System.out.println("Digite o Nome do Aluno");
        String nome = sc.next();
        System.out.println("Informe o CPF do Aluno");
        String cpf = sc.next();
        System.out.println("Informe a Data de Nascimento do Aluno");
        String dataNasc = sc.next();
        System.out.println("Informe a Matricula do Aluno");
        String matricula = sc.next();
        return new Aluno(nome, cpf, dataNasc, matricula);
    }
}
