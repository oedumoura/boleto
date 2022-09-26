package com.example.api.pagamentoboleto.repository;

import com.example.api.pagamentoboleto.models.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto, Long> {

}
