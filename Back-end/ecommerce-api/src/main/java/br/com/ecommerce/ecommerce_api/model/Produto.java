package br.com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue
    @Column(name = "id_produto")
    private long id;

    @Column(name = "nome_produto", nullable = false, length = 100)
    private String nome;

    @Column(name = "preco", nullable = false)
    private Double preco;

}
