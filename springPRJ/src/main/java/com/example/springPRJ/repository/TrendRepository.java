package com.example.springPRJ.repository;

import com.example.springPRJ.model.trend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrendRepository extends PagingAndSortingRepository<trend, Long>, CrudRepository<trend, Long> { }

