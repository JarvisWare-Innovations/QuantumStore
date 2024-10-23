package br.com.ecommerce.ecommerce_api.model;

/**
 * @author Kadu Ribeiro
 *
 */


import jakarta.persistence.*;

@Entity
@Table(name = "tb_pagamentos")

public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String metodoPagamento;

    private String statusPagamento;

    public Pagamento() {
    }

    public Pagamento(String metodoPagamento, String statusPagamento) {
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetodoPagamento() {
        return this.metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getStatusPagamento() {
        return this.statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }


//    public boolean processarPagamento (){
//        if ("PAGO".equalsIgnoreCase(statusPagamento)) {
//            System.out.println("Pagamento já foi relizado.");
//            return false;
//        } else {
//            statusPagamento = "PAGO";
//            System.out.println("Pagamento realizado com sucesso.");
//            return true;
//        }
//    }

@Override
public String toString() {
    return "Pagamento{" + "id=" + id + ", metodoPagamento=" + metodoPagamento + '\'' + ", statusPagamento=" + statusPagamento + '\'' +
    '}';
    }

}
