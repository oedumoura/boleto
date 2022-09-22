package com.example.api.pagamentoboleto.dto;

import com.example.api.pagamentoboleto.models.TipoTransacao;
import lombok.Data;

@Data
public class TransacaoDTO {

    private TipoTransacao tipoTransacao;
    private long idTransacao;
    private long idConta;
    private String nomeConta;
    private String data;
    private double valor;

}
