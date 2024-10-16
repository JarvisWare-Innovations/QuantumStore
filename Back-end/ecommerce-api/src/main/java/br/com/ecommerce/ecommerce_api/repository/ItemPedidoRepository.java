package br.com.ecommerce.ecommerce_api.repository;

import br.com.ecommerce.ecommerce_api.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nícolas Santos
 *
 */

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {


}
