package com.exercicio.leilao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T,ID> extends CrudRepository<T,ID> {
    @Override
    List<T> findAll();
}
