package br.com.ecommerce.ecommerce_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kadu Ribeiro
 *
 */

import br.com.ecommerce.ecommerce_api.model.Admin;




@Repository
public interface AdminRepository extends JpaRepository <Admin, Long>{

    Optional<Admin> findByNome (String nome);

    Optional<Admin> findByEmail(String email);

    Optional<Admin> findByAtivo(Boolean ativo);


}
