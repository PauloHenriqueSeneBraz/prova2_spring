package SpringBoot.repositorios;

import SpringBoot.entidades.Desenvolvedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesenvolvedorRepositorio extends JpaRepository<Desenvolvedor, Integer> {
}
