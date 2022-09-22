package com.ap4boletoapi.boleto.controller;

import com.ap4boletoapi.boleto.dto.TransacaoDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

public class BoletoController  {
    @PostMapping(path = "/boleto")
    public ResponseEntity<TransacaoDTO> boleto(@RequestBody TransacaoDTO transacaoDTO){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<TransacaoDTO> request = new HttpEntity<>(transacaoDTO);
        ResponseEntity<TransacaoDTO> response = restTemplate.postForEntity("http://localhost:8081/transacoes/boleto", request, TransacaoDTO.class);
        return response;
    }
}
