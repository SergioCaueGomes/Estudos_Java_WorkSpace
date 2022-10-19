package br.com.dio.me.RestfullApplication.service;

import br.com.dio.me.RestfullApplication.controller.request.UsuarioEditRequest;
import br.com.dio.me.RestfullApplication.dto.Usuario;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UsuarioService {

    public Usuario buscarUsuario(String cpf) {
        Usuario usuario = new Usuario();
        return usuario;
    }

    public void criarUsuario(Usuario usuario) {

    }

    public void editarUsuario(String cpf, UsuarioEditRequest usuarioEditRequest) {

    }

    public void deletarUsuario(String cpf) {

    }

    public List<Usuario> buscarUsuarios() {
        Usuario usuario1 = new Usuario();
        usuario1.setCpf("987654321");
        usuario1.setNome("Sergio");
        usuario1.setSobreNome("Gomes");
        usuario1.setEmail("sergio@gmail.com");

        Usuario usuario2 = new Usuario();
        usuario2.setCpf("098765432");
        usuario2.setNome("Abdias");
        usuario2.setSobreNome("Santos");
        usuario2.setEmail("bidi@gmail.com");

        Usuario usuario = new Usuario();
        usuario.setCpf("123456789");
        usuario.setNome("Karla");
        usuario.setSobreNome("Albuquerque");
        usuario.setEmail("karla@gmail.com");

        return Arrays.asList(usuario, usuario1, usuario2);
    }
}
