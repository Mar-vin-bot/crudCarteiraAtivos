package com.br.ativos.crudativos_auala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ativos.crudativos_auala.Domain.FundoImobiliario;

@Repository
public interface FundoImobiliarioRepository extends JpaRepository <FundoImobiliario, Integer> {
    
}
