package br.com.ecommerce.ecommerce_api.controller;

import br.com.ecommerce.ecommerce_api.model.Pagamento;
import br.com.ecommerce.ecommerce_api.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Nícolas Santos
 */

@RestController
@RequestMapping("/pagamento")

public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public Pagamento salvarPagamento(@RequestBody Pagamento pagamento){
        return pagamentoService.salvarPagamento(pagamento);
    }

    @GetMapping("/{id}")
    public Pagamento buscarPagamento(@PathVariable int id){
        return pagamentoService.buscarPagamento(id);
    }

    @GetMapping
    public List<Pagamento> listarTodos(){
        return pagamentoService.listaTodos();
    }

    @DeleteMapping("/{id}")
    public void removerPagamento(@PathVariable int id){
        pagamentoService.removerPagamento(id);
    }

    @PutMapping("/{id}")
    public Pagamento update(@PathVariable int id, @RequestBody Pagamento pagamento){
        return pagamentoService.update(id, pagamento);
    }

}
