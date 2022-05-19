package SpringBoot.recursos;

import SpringBoot.entidades.Jogo;
import SpringBoot.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogoRecurso {

    @Autowired
    private JogoRepositorio jogoRepositorio;

    @GetMapping
    public ResponseEntity<List<Jogo>> buscarTudo() {

        return ResponseEntity.ok(jogoRepositorio.findAll());
    }

    @PostMapping
    public ResponseEntity<Jogo> inserir(@RequestBody Jogo jogo) {
        Jogo retorno = jogoRepositorio.save(jogo);
        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id) {
        jogoRepositorio.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Jogo> editar(@RequestBody Jogo jogo) {
        Jogo retorno = jogoRepositorio.save(jogo);
        return ResponseEntity.ok(retorno);
    }

}