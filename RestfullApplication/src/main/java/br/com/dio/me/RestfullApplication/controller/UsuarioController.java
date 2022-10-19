package br.com.dio.me.RestfullApplication.controller;

import br.com.dio.me.RestfullApplication.controller.request.UsuarioEditRequest;
import br.com.dio.me.RestfullApplication.dto.Usuario;
import br.com.dio.me.RestfullApplication.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Usuario>  buscarUsuario(@PathVariable() String cpf) {
        Usuario usuario = usuarioService.buscarUsuario(cpf);
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarUsuario() {
        List<Usuario> usuarios = usuarioService.buscarUsuarios();
        return ResponseEntity.status(HttpStatus.OK).body(usuarios);
    }

    @PostMapping
    public ResponseEntity criarUsuario(@RequestBody Usuario usuario) {
        usuarioService.criarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{cpf}")
    public ResponseEntity editarUsuario(@PathVariable() String cpf, @RequestBody UsuarioEditRequest usuarioEditRequest) {
        usuarioService.editarUsuario(cpf, usuarioEditRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity deletarUsuario(@PathVariable String cpf) {
        usuarioService.deletarUsuario(cpf);
        return ResponseEntity.ok().build();
    }
}
