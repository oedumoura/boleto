package com.ap4boletoapi.boleto.dto;

import com.ap4boletoapi.boleto.models.TipoTransacao;
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
