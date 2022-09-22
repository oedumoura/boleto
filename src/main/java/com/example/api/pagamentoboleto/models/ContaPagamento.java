package com.example.api.pagamentoboleto.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ContaPagamento {
    @Id
    private long id;
    private String numeroConta;
    private String agencia;
    private long idCliente;
    private String nomeCliente;
    private double saldo;
    private boolean status;
}
