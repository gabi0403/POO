package senai.estoque.gerenciamento_estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import senai.estoque.gerenciamento_estoque.service.EstoqueService;


@Controller
@RequestMapping("/app/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @GetMapping("/materiais")
    public String listarMateriais(Model model) {
        model.addAttribute("materiais", estoqueService.listarTodos());
        return "estoque/lista"; // vai procurar em templates/estoque/lista.html
    }
}