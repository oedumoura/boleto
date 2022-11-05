package com.example.api.pagamentoboleto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data @Builder
@AllArgsConstructor
public class ResponseDTO {

    public Object result;
    public String environment;
}
