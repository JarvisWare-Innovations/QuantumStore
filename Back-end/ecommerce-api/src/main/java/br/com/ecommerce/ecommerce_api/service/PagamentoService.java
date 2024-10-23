package br.com.ecommerce.ecommerce_api.service;

import java.util.List;

import br.com.ecommerce.ecommerce_api.model.ItemPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ecommerce_api.model.Pagamento;
import br.com.ecommerce.ecommerce_api.repository.PagamentoRepository;

/**
 * @author Kadu Ribeiro
 *
 */

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public Pagamento salvarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);

    }

//    public boolean processarPagamento(int id) {
//        Pagamento pagamento = pagamentoRepository.findById(id).orElse(null);
//        if (pagamento != null) {
//            return pagamento.processarPagamento();
//        }
//        return false;
//    }

    public Pagamento buscarPagamento(int id) {
        return pagamentoRepository.findById(id).orElse(null);
   }

   public List<Pagamento> listaTodos() {
    return pagamentoRepository.findAll();
   }

   public void removerPagamento(int id){
    pagamentoRepository.deleteById(id);
   }

    public Pagamento update(int id, Pagamento pagamento) {
        if (pagamentoRepository.existsById(id)) {
            pagamento.setId(id);
        } else {
            throw new RuntimeException("Este Pagamento não consta em nossa basse de dados!");
        }
        return pagamento;
    }
}
