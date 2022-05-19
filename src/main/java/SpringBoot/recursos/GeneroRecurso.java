package SpringBoot.recursos;

import SpringBoot.entidades.Genero;
import SpringBoot.repositorios.AnaliseRepositorio;
import SpringBoot.repositorios.CompraRepositorio;
import SpringBoot.repositorios.DesenvolvedorRepositorio;
import SpringBoot.repositorios.GeneroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/generos")
public class GeneroRecurso {

    @Autowired
    private GeneroRepositorio generoRepositorio;

    @GetMapping
    public ResponseEntity<List<Genero>> buscarTudo() {

        return ResponseEntity.ok(generoRepositorio.findAll());
    }

    @PostMapping
    public ResponseEntity<Genero> inserir(@RequestBody Genero genero) {
        Genero retorno = generoRepositorio.save(genero);
        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id) {
        generoRepositorio.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Genero> editar(@RequestBody Genero genero) {
        Genero retorno = generoRepositorio.save(genero);
        return ResponseEntity.ok(retorno);
    }

}