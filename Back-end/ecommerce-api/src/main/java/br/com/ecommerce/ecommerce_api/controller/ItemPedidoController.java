package br.com.ecommerce.ecommerce_api.controller;

import br.com.ecommerce.ecommerce_api.model.ItemPedido;
import br.com.ecommerce.ecommerce_api.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Nícolas Santos
 */

@RestController
@RequestMapping("/itemPedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @PostMapping
    public ItemPedido salvar(@RequestBody ItemPedido itemPedido){
        return itemPedidoService.salvarItemPedido(itemPedido);
    }

    @GetMapping("{id}")
    public ItemPedido buscarItemPedido(@PathVariable int id){
        return itemPedidoService.buscarItemPedido(id);
    }

    @GetMapping
    public List<ItemPedido> listarTodos(){
        return itemPedidoService.listTodos();
    }

    @DeleteMapping("/{id}")
    public void removerItemPedido(@PathVariable int id){
        itemPedidoService.removerItemPedido(id);
    }

    @PutMapping("/{id}")
    public ItemPedido update(@PathVariable int id, @RequestBody ItemPedido itemPedido) {
        return itemPedidoService.update(id, itemPedido);
    }


}
