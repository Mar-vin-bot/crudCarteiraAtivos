package com.br.ativos.crudativos_auala.Domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data			
@NoArgsConstructor	
@Entity


public class Proventos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipoProvento;
    private String ticket;
    private float valorLiquido;
    private Date dtPagamento;

    @OneToOne
    private List<Acao> acao = new ArrayList<Acao>();

    @OneToOne
    private List<FundoImobiliario> fii = new ArrayList<FundoImobiliario>();

}
