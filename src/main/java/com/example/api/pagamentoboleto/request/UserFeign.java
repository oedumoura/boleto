package com.example.api.pagamentoboleto.request;

import com.example.api.pagamentoboleto.dto.TransacaoDTO;
import com.example.api.pagamentoboleto.exceptions.ContaBloqueadaException;
import com.example.api.pagamentoboleto.exceptions.SaldoInsuficienteException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "bank-api", url = "http://localhost:8081")
public interface UserFeign {

    @PostMapping(path = "/transacoes/boleto")
    ResponseEntity<TransacaoDTO> boleto(@RequestBody TransacaoDTO transacaoDTO) throws ContaBloqueadaException, SaldoInsuficienteException;

}
