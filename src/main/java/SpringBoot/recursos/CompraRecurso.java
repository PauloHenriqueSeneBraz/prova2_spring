package SpringBoot.recursos;

import SpringBoot.entidades.Compra;
import SpringBoot.repositorios.AnaliseRepositorio;
import SpringBoot.repositorios.CompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraRecurso {

    @Autowired
    private CompraRepositorio compraRepositorio;

    @GetMapping
    public ResponseEntity<List<Compra>> buscarTudo() {

        return ResponseEntity.ok(compraRepositorio.findAll());
    }

    @PostMapping
    public ResponseEntity<Compra> inserir(@RequestBody Compra compra) {
        Compra retorno = compraRepositorio.save(compra);
        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id) {
        compraRepositorio.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Compra> editar(@RequestBody Compra compra) {
        Compra retorno = compraRepositorio.save(compra);
        return ResponseEntity.ok(retorno);
    }

}