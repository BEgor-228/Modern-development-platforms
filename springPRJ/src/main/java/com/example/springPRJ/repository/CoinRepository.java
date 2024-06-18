package com.example.springPRJ.repository;

import com.example.springPRJ.model.coin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepository extends PagingAndSortingRepository<coin, Long>, CrudRepository<coin, Long> { }
