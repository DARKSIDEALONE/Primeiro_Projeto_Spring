package senai.gabriel.atividadeprojetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.gabriel.atividadeprojetospring.models.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel,Integer> {
}
