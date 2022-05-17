package com.exercicio.leilao.service;

import java.util.List;

import com.exercicio.leilao.domain.ItemDeLeilao;
import com.exercicio.leilao.repository.ItemDeLeilaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDeLeilaoService implements GenericService<ItemDeLeilao, Integer> {

    @Autowired
    ItemDeLeilaoRepository repository;

    @Override
    public ItemDeLeilao create(ItemDeLeilao object) {
        return repository.save(object);
    }

    @Override
    public List<ItemDeLeilao> readAll() {
        return repository.findAll();
    }

    @Override
    public ItemDeLeilao readById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public ItemDeLeilao update(Integer id, ItemDeLeilao object) {
        object.setId(id);
        return repository.save(object);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    
}
