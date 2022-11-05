package com.example.api.pagamentoboleto.controller;

import com.example.api.pagamentoboleto.dto.TransacaoDTO;
import com.example.api.pagamentoboleto.exceptions.ContaBloqueadaException;
import com.example.api.pagamentoboleto.exceptions.SaldoInsuficienteException;
import com.example.api.pagamentoboleto.request.UserFeign;
import com.example.api.pagamentoboleto.services.TransacaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping(value = "/payment")
public class TransacaoController {

    private  final TransacaoService service;

    @PostMapping(value = "/boleto")
    public ResponseEntity boleto(@RequestBody TransacaoDTO transacaoDTO) throws SaldoInsuficienteException, ContaBloqueadaException {
        return new ResponseEntity(service.payment(transacaoDTO), HttpStatus.OK);
    }
}
