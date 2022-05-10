package com.example.demo.service;


import com.example.demo.domain.ItemDeLeilao;
import com.example.demo.repository.ItemDeLeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDeLeilaoService implements GenericService<ItemDeLeilao, Integer> {

    @Autowired
    ItemDeLeilaoRepository repo;

    @Override
    public ItemDeLeilao create(ItemDeLeilao object) {
        return repo.save(object);
    }

    @Override
    public List<ItemDeLeilao> readAll() {
        return repo.findAll();
    }

    @Override
    public ItemDeLeilao readById(Integer id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public ItemDeLeilao update(Integer id, ItemDeLeilao object) {
        object.setId(id);
        return repo.save(object);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
