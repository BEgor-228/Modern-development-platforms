package com.example.springPRJ.repository;

import com.example.springPRJ.model.deal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepository extends PagingAndSortingRepository<deal, Long>, CrudRepository<deal, Long> { }
