package SpringBoot.repositorios;

import SpringBoot.entidades.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepositorio extends JpaRepository<Compra, Integer> {
}
