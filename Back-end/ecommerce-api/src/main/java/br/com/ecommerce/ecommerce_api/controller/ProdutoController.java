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

import br.com.ecommerce.ecommerce_api.model.Produto;
import br.com.ecommerce.ecommerce_api.service.ProdutoService;

/**
 * @author Kadu Ribeiro
 */

@RequestMapping("/Produtos")
@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterProduto() {
        return produtoService.obterProduto();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.create(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizaProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.update(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id){
        produtoService.delete(id);
    }
}
