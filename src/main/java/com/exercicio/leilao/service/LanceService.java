package com.exercicio.leilao.service;

import java.util.List;

import com.exercicio.leilao.domain.Lance;
import com.exercicio.leilao.repository.LanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanceService implements GenericService<Lance, Integer> {

    @Autowired
    LanceRepository repository;

    @Override
    public Lance create(Lance object) {
        return repository.save(object);
    }

    @Override
    public List<Lance> readAll() {
        return repository.findAll();
    }

    @Override
    public Lance readById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Lance update(Integer id, Lance object) {
        object.setId(id);
        return repository.save(object);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
