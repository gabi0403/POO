import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //aqui eu executos as ações 
        //vamos instanciar(criar um obj) um objeto da classe Pessoa
        Pessoa obj = new Pessoa("123", "José", 30);

        obj.setIdade(20);

        System.out.println("Nome da Pessoa: "+obj.getNome());
        System.out.println("Idade da Pessoa: "+obj.getIdade());

// nao deu certo 
    }
} 
