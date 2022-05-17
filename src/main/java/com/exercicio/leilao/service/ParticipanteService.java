package com.exercicio.leilao.service;

import java.util.List;

import com.exercicio.leilao.domain.Participante;
import com.exercicio.leilao.repository.ParticipanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteService implements GenericService<Participante, Integer> {

    @Autowired
    ParticipanteRepository participante;

    @Override
    public Participante create(Participante object) {
        return participante.save(object);
    }

    @Override
    public List<Participante> readAll() {
        return participante.findAll();
    }

    @Override
    public Participante readById(Integer id) {
        return participante.findById(id).orElseThrow();
    }

    @Override
    public Participante update(Integer id, Participante object) {
        object.setId(id);
        return participante.save(object);
    }

    @Override
    public void delete(Integer id) {
        participante.deleteById(id);
    }

}
