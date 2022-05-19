package SpringBoot.recursos;

import SpringBoot.entidades.Analise;
import SpringBoot.repositorios.AnaliseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analises")
public class AnaliseRecurso {

    @Autowired
    private AnaliseRepositorio analiseRepositorio;

    @GetMapping
    public ResponseEntity<List<Analise>> buscarTudo() {

        return ResponseEntity.ok(analiseRepositorio.findAll());
    }

    @PostMapping
    public ResponseEntity<Analise> inserir(@RequestBody Analise analise) {
        Analise retorno = analiseRepositorio.save(analise);
        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id) {
        analiseRepositorio.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Analise> editar(@RequestBody Analise analise) {
        Analise retorno = analiseRepositorio.save(analise);
        return ResponseEntity.ok(retorno);
    }

}