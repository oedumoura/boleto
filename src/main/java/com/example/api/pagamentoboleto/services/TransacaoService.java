package com.example.api.pagamentoboleto.services;

import com.example.api.pagamentoboleto.dto.ResponseDTO;
import com.example.api.pagamentoboleto.exceptions.ContaBloqueadaException;
import com.example.api.pagamentoboleto.exceptions.SaldoInsuficienteException;
import com.example.api.pagamentoboleto.request.UserFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import com.example.api.pagamentoboleto.dto.TransacaoDTO;

import java.util.Objects;


@RequiredArgsConstructor
@Service
public class TransacaoService {


    private final UserFeign feign;
    private final Environment environment;

    public ResponseDTO payment(TransacaoDTO transacaoDTO) throws SaldoInsuficienteException, ContaBloqueadaException {
        var result = feign.boleto(transacaoDTO).getBody();

        if(Objects.nonNull(result)){
            return ResponseDTO.builder()
                    .result(result)
                    .environment("Port " + environment.getProperty("local.server.port"))
                    .build();
        }
        return null;
    }
}
