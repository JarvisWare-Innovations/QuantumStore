package br.com.ecommerce.ecommerce_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.ecommerce_api.model.Produto;

/**
 * @author Kadu Ribeiro
 *
 */
@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{

    List<Produto> findByNome(String nome);

    List<Produto> findByPrecoBetween(double minPreco, double maxPreco);

    List<Produto> findByEstoqueLessThanEqual(int quantidade);


}
