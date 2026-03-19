package senai.estoque.gerenciamento_estoque.controller;

import jakarta.servlet.http.HttpSession;
import senai.estoque.gerenciamento_estoque.model.Funcionario;
import senai.estoque.gerenciamento_estoque.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth") // Isso organiza todas as rotas abaixo para começarem com /auth
public class AuthController {

    @Autowired
    private AuthService authService;

    // Acessar via: http://localhost:8080/auth/login
    @GetMapping("/login")
    public String loginPage() {
        return "auth/login"; 
    }

    @PostMapping("/login")
    public String login(@RequestParam String nif, @RequestParam String senha, HttpSession session, Model model) {
        
        Funcionario funcionario = authService.autenticar(nif, senha);

        if (funcionario == null) {
            model.addAttribute("erro", "NIF ou senha inválidos.");
            return "auth/login";
        }

        session.setAttribute("usuarioLogado", true);
        session.setAttribute("nif", nif);
        session.setAttribute("nomeUsuario", funcionario.getNome());

        return "redirect:/app";
    }

    // Acessar via: http://localhost:8080/auth/cadastro
    @GetMapping("/cadastro")
    public String cadastroPage() {
        return "auth/cadastro";
    }

    @PostMapping("/cadastro")
    public String realizarCadastro(@RequestParam String nome, @RequestParam String nif, @RequestParam String senha, Model model) {
        String mensagemErro = authService.cadastrar(nome, nif, senha);
        
        if (mensagemErro != null) {
            model.addAttribute("erro", mensagemErro);
            return "auth/cadastro";
        }
        
        model.addAttribute("sucesso", "Cadastro realizado com sucesso! Faça login.");
        return "auth/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}