package com.example.api.pagamentoboleto.dto;

import lombok.Data;

import java.util.List;

@Data
public class ContaPagamentoDTO {

    private long id;
    private String numeroConta;
    private String agencia;
    private long idCliente;
    private String nomeCliente;
    private double saldo;
    private boolean status;
    private List<TransacaoDTO> transcoes;
}
