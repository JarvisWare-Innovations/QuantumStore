package br.com.ecommerce.ecommerce_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.ecommerce_api.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByemail(String email);

    List<Usuario> findByAtivo(Boolean ativo);

    List<Usuario> findByPedidosIsNotNull();

}
