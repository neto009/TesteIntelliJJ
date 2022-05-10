package com.example.demo.repository;

import com.example.demo.domain.Lance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanceRepository extends GenericRepository<Lance, Integer> {

}
