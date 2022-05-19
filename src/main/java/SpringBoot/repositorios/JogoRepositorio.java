package SpringBoot.repositorios;

import SpringBoot.entidades.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepositorio extends JpaRepository<Jogo, Integer> {
}
