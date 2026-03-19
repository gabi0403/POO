package senai.estoque.gerenciamento_estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.estoque.gerenciamento_estoque.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}