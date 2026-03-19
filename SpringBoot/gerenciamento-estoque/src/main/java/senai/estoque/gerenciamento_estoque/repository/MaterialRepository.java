package senai.estoque.gerenciamento_estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.estoque.gerenciamento_estoque.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}