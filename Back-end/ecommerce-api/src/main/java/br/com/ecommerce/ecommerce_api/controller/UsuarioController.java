package br.com.ecommerce.ecommerce_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce_api.model.Usuario;
import br.com.ecommerce.ecommerce_api.service.UsuarioService;

/**
 * @author Kadu Ribeiro
 */

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> obterUsuario() {
        return usuarioService.obterUsuario();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.create(usuario);
    }
    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario ){
        return usuarioService.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
