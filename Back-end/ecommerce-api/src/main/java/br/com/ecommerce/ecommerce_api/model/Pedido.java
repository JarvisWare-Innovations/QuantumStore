package br.com.ecommerce.ecommerce_api.model;

/**
 * @author Kadu Ribeiro
 *
 */


import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date dataPedido;

    private String status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pedido")
    private List<ItemPedido> itens;

    public Pedido() {
    }

    public Pedido(int id, Date datePedido, String status, List<ItemPedido> itens) {
        this.id = id;
        this.dataPedido = datePedido;
        this.status = status;
        this.itens = itens;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPedido() {
        return this.dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    private double calcularTotal() {
        return itens.stream()
                .mapToDouble(ItemPedido::calcularSubtotal)
                .sum();
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", dataPedido=" + dataPedido + ", status=" + status + '\'' + ", total ="
                + calcularTotal() + '}';
    }

}
