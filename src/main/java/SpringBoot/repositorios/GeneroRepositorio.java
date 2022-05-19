package SpringBoot.repositorios;

import SpringBoot.entidades.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepositorio extends JpaRepository<Genero, Integer> {
}
