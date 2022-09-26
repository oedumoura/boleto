package com.example.api.pagamentoboleto.controller;

import com.example.api.pagamentoboleto.dto.TransacaoDTO;
import com.example.api.pagamentoboleto.repository.BoletoRepository;
import com.example.api.pagamentoboleto.request.BancoAq4request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(path = "/boleto")
public class BoletoController {

    @PostMapping
    public ResponseEntity<TransacaoDTO> boleto(@RequestBody TransacaoDTO transacaoDTO){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<TransacaoDTO> request = new HttpEntity<>(transacaoDTO);
        ResponseEntity<TransacaoDTO> response = restTemplate.postForEntity("http://localhost:8081/transacoes/boleto", request, TransacaoDTO.class);
        return response;
    }
}
