package com.romulo.clientesapi.model;

import jakarta.persistence.*;

/**
 * Entidade que representa um cliente no sistema.
 * Mapeada automaticamente para a tabela "cliente" no banco de dados via JPA.
 */
@Entity
public class Cliente {

    /** Identificador único do cliente, gerado automaticamente pelo banco. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Nome completo do cliente. */
    private String nome;

    /** Endereço de e-mail do cliente. */
    private String email;

    /** Número de telefone do cliente. */
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}