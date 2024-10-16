package br.com.ecommerce.ecommerce_api.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_admin")
    private long id_admin;

    @Column(name = "nome_admin", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "telefone", nullable = false)
    private Integer telefone;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;

    @Column(name = "ultimo_acesso", nullable = false)
    private LocalDate ultimoAcesso;

    @Column (name = "ativo", nullable = false)
    private Boolean ativo;

    public long getId_admin() {
        return id_admin;
    }

    public void setId_admin(long id_admin) {
        this.id_admin = id_admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(LocalDate ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id_admin=" + id_admin +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone=" + telefone +
                ", dataCadastro=" + dataCadastro +
                ", ultimoAcesso=" + ultimoAcesso +
                ", ativo=" + ativo +
                '}';
    }
}
