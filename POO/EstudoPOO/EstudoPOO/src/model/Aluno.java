//subClasse de Pessoa
package model;

public class Aluno extends Pessoa {
    // ATRIBUTOS
    private String matricula;
    private double nota;

    // MÉTODOS
    // construtor (sem nota, pois a nota pode ser atribuída depois)
    public Aluno(String nome, String cpf, String dataNasc, String matricula) {
        super(nome, cpf, dataNasc); // chama o construtor da classe pai (Pessoa)
        this.matricula = matricula;
    }
    
    // getter e setter para matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;

    }
    // exibir informações do aluno
    @Override // polimorfismo de classe
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Matrícula: " + matricula);

    }

}
