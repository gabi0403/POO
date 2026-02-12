// subClasse de Pessoa
package model;

public class Professor extends Pessoa {
    // Atributos
    private double salario;

    // métodos
    public Professor(String nome, String cpf, String dataNasc, double salario) {
        super(nome, cpf, dataNasc); // chama o construtor da classe pai (Pessoa)
        this.salario = salario;

    }
    // getter e setter para salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //exibir info
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Salário: R$" + salario);
    }
}
