package br.com.ecommerce.ecommerce_api.controller;


import br.com.ecommerce.ecommerce_api.model.Pedido;
import br.com.ecommerce.ecommerce_api.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido salvarPedido(@RequestBody Pedido pedido){
        return pedidoService.salvarPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido buscarPedido(@PathVariable int id){
        return pedidoService.buscarPedido(id);
    }

    @GetMapping
    public List<Pedido> listarTodos(){
        return pedidoService.listarTodos();
    }

    @DeleteMapping("/{id}")
    public void removerPedido(@PathVariable int id){
        pedidoService.removerPedido(id);
    }

    @PutMapping("/{id}")
    public Pedido update(@PathVariable int id, @RequestBody Pedido pedido){
        return pedidoService.update(id, pedido);
    }
}
