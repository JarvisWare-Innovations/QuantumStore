package br.com.ecommerce.ecommerce_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ecommerce_api.model.Pedido;
import br.com.ecommerce.ecommerce_api.repository.PedidoRepository;

/**
 * @author Kadu Ribeiro
 *
 */

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPedido(int id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public double calcularTotalPedido(Integer id) {
        Pedido pedido = pedidoRepository.findById(id).orElse(null);
        if (pedido != null) {
            return pedido.calcularTotal();
        }
        return 0.0;
    }

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public void removerPedido(int id) {
        pedidoRepository.deleteById(id);
    }

    public Pedido update(int id, Pedido pedido) {
        if (pedidoRepository.existsById(id)) {
            pedido.setId(id);
        } else {
            throw new RuntimeException("Este Pedido não consta em nossa basse de dados!");
        }
        return pedido;
    }

}
