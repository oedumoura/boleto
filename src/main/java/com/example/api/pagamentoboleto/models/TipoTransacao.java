package com.example.api.pagamentoboleto.models;

public enum TipoTransacao {

    SAQUE, DEPOSITO, PAGAMENTO_BOLETO, BOLETO;

    public int id;

    TipoTransacao() {
        this.id = id;
    }
}
