package com.br.ativos.crudativos_auala.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data			
@NoArgsConstructor	
@Entity

public class FundoImobiliario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantidade;
    private String ticket;
    private String operacao;    //compra, venda, subscricao   
    private double valorOperacao;
    private Date dtOperacaoAtual;

    @OneToMany
    private List<Proventos> proventos  = new ArrayList<Proventos>();

}
