package com.exercicio.leilao.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // construtor padrão
@Entity
public class ItemDeLeilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private double valorMinimo;
    private boolean leilaoAberto;
    
    @OneToMany
    private List<Lance> lancesRecebidos = new ArrayList<Lance>();
    
    @OneToOne
    private Lance lanceVencedor;

}
