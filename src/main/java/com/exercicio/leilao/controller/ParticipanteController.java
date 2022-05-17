package com.exercicio.leilao.controller;

import java.util.List;

import com.exercicio.leilao.domain.Participante;
import com.exercicio.leilao.service.ParticipanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("participante")
public class ParticipanteController {
    
    @Autowired
    ParticipanteService service;

    @GetMapping
    ResponseEntity<List<Participante>> participantes (){
        return ResponseEntity.status(HttpStatus.OK).body(service.readAll());
    }

    @PostMapping
    ResponseEntity<Participante> novo (@RequestBody Participante participante){
        return ResponseEntity.status(HttpStatus.OK).body(service.create(participante));
    }
}
