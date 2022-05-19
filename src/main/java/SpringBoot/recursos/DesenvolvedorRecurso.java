package SpringBoot.recursos;

import SpringBoot.entidades.Desenvolvedor;
import SpringBoot.repositorios.AnaliseRepositorio;
import SpringBoot.repositorios.CompraRepositorio;
import SpringBoot.repositorios.DesenvolvedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/desenvolvedores")
public class DesenvolvedorRecurso {

    @Autowired
    private DesenvolvedorRepositorio desenvolvedorRepositorio;

    @GetMapping
    public ResponseEntity<List<Desenvolvedor>> buscarTudo() {

        return ResponseEntity.ok(desenvolvedorRepositorio.findAll());
    }

    @PostMapping
    public ResponseEntity<Desenvolvedor> inserir(@RequestBody Desenvolvedor desenvolvedor) {
        Desenvolvedor retorno = desenvolvedorRepositorio.save(desenvolvedor);
        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id) {
        desenvolvedorRepositorio.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Desenvolvedor> editar(@RequestBody Desenvolvedor desenvolvedor) {
        Desenvolvedor retorno = desenvolvedorRepositorio.save(desenvolvedor);
        return ResponseEntity.ok(retorno);
    }

}