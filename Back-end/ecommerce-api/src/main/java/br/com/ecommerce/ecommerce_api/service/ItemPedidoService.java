package br.com.ecommerce.ecommerce_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ecommerce_api.model.ItemPedido;
import br.com.ecommerce.ecommerce_api.repository.ItemPedidoRepository;

/**
 * @author Kadu Ribeiro
 */

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public ItemPedido salvarItemPedido(ItemPedido ItemPedido) {
        return itemPedidoRepository.save(ItemPedido);
    }

    public ItemPedido buscarItemPedido(int id) {
        return itemPedidoRepository.findById(id).orElse(null);
    }

    public List<ItemPedido> listTodos() {
        return itemPedidoRepository.findAll();
    }

    public void removerItemPedido(int id) {
        itemPedidoRepository.deleteById(id);
    }

    public ItemPedido update(int id, ItemPedido itemPedido) {
        if (itemPedidoRepository.existsById(id)) {
            itemPedido.setId(id);
        } else {
            throw new RuntimeException("Este item não consta em nossa basse de dados!");
        }
        return itemPedido;
    }


}
