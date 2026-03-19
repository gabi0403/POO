package senai.estoque.gerenciamento_estoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.estoque.gerenciamento_estoque.model.Material;
import senai.estoque.gerenciamento_estoque.repository.MaterialRepository;
import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> listarTodos() {
        return materialRepository.findAll();
    }

    public void salvar(Material material) {
        materialRepository.save(material);
    }
}