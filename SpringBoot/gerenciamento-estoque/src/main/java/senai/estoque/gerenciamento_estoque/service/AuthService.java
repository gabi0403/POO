package senai.estoque.gerenciamento_estoque.service;

import senai.estoque.gerenciamento_estoque.model.Funcionario;
import senai.estoque.gerenciamento_estoque.model.FuncionarioAutenticado;
import senai.estoque.gerenciamento_estoque.repository.FuncionarioAutenticadoRepository;
import senai.estoque.gerenciamento_estoque.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioAutenticadoRepository autenticadoRepository;

    public String cadastrar(String nome, String nif, String senha) {
        // Validação 1: Já existe cadastro?
        if (funcionarioRepository.existsByNif(nif)) {
            return "Erro: Este NIF já está cadastrado no sistema.";
        }

        // Validação 2: Está na "Lista Branca" do SENAI?
        boolean autorizado = autenticadoRepository.existsByNifAndNomeAndAtivoTrue(nif, nome);
        if (!autorizado) {
            return "Erro: Nome ou NIF não autorizados para cadastro.";
        }

        // salva o funcionário
        Funcionario novo = new Funcionario();
        novo.setNome(nome);
        novo.setNif(nif);
        novo.setSenha(senha);
        funcionarioRepository.save(novo);

        return null; // Retorna null quando não há erros
    }

    public Funcionario autenticar(String nif, String senha) {
        Optional<Funcionario> funcionario = funcionarioRepository.findByNif(nif);
        
        if (funcionario.isPresent() && funcionario.get().getSenha().equals(senha)) {
            return funcionario.get();
        }
        return null;
    }
}