package com.example.springPRJ.repository;

import com.example.springPRJ.model.portfolio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends PagingAndSortingRepository<portfolio, Long>, CrudRepository<portfolio, Long> { }

