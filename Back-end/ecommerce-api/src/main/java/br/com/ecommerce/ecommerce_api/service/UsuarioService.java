package br.com.ecommerce.ecommerce_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ecommerce_api.model.Usuario;
import br.com.ecommerce.ecommerce_api.repository.UsuarioRepository;

/**
 * @author Nícolas Santos
 */

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obterUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario update(Long id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
        } else {
            throw new RuntimeException("Este usuário não consta em nosso base de dados, Para de viajar e digita certo o bagulho!");
        }

        return usuario;
    }

    public String delete(Long id){
        if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
            return "Usuário excluido com sucesso";
        }else {
            throw new RuntimeException("Este usuário não consta em nosso base de dados, Para de viajar e digita certo o bagulho!");
        }
    }


}
