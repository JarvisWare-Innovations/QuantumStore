package br.com.ecommerce.ecommerce_api.service;

import br.com.ecommerce.ecommerce_api.model.Produto;
import br.com.ecommerce.ecommerce_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nícolas Santos
 */

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public Produto create(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> obterProduto() {
        return produtoRepository.findAll();
    }

    public Produto update(Long id, Produto produto) {
        if (produtoRepository.existsById(id)) {
            produto.setId(id);
        } else {
            throw new RuntimeException("Este produto não consta em nossa basse de dados!");
        }
        return produto;
    }

    public String delete(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return "Produto excluido com sucesso";
        } else {
            throw new RuntimeException("Pelo amor de Deus Digite certo essa budega!");
        }
    }
}
