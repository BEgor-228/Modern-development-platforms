package com.example.springPRJ.repository;

import com.example.springPRJ.model.exchange;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends PagingAndSortingRepository<exchange, Long>, CrudRepository<exchange, Long> { }

