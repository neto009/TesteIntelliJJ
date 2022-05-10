package com.example.demo.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
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
