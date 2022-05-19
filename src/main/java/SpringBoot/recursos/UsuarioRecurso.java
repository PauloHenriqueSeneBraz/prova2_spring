package SpringBoot.recursos;

import SpringBoot.entidades.Usuario;
import SpringBoot.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRecurso {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTudo() {

        return ResponseEntity.ok(usuarioRepositorio.findAll());
    }

    @PostMapping
    public ResponseEntity<Usuario> inserir(@RequestBody Usuario usuario) {
        Usuario retorno = usuarioRepositorio.save(usuario);
        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id) {
        usuarioRepositorio.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Usuario> editar(@RequestBody Usuario usuario) {
        Usuario retorno = usuarioRepositorio.save(usuario);
        return ResponseEntity.ok(retorno);
    }

}