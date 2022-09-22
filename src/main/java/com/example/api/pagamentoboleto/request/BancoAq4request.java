package com.example.api.pagamentoboleto.request;

import com.example.api.pagamentoboleto.dto.ContaPagamentoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bancoAq4", url = "http://localhost:8081")
public interface BancoAq4request {
    @GetMapping("/bancoAq4/{id}")
    ContaPagamentoDto getByCode(
    @PathVariable long id
    );

}
