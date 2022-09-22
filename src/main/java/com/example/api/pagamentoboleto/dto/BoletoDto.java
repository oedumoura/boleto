package com.example.api.pagamentoboleto.dto;

import lombok.Data;

@Data
public class BoletoDto {
    private long id;
    private long idConta;
    private String nomeConta;
    private String data;
    private double valor;
}
