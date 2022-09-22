package com.example.api.pagamentoboleto.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Boleto {
    @Id
    @GeneratedValue
    private long id;
    private long idConta;
    private String nomeConta;
    private String data;
    private double valor;

}
