package com.example.demo.repository;

import com.example.demo.domain.Lance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenericRepository<T, ID> extends CrudRepository<T, ID> {

    @Override
    List<T> findAll();
}
