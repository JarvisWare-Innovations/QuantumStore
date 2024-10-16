package br.com.ecommerce.ecommerce_api.repository;

import br.com.ecommerce.ecommerce_api.model.DataBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nícolas Santos
 */

@Repository
public interface DataBaseRepository extends JpaRepository<DataBase, Integer> {

}
