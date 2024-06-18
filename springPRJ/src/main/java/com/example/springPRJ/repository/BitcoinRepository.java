package com.example.springPRJ.repository;

import com.example.springPRJ.controller.Bitcoin;
import org.springframework.data.repository.CrudRepository;
public interface BitcoinRepository extends
        CrudRepository<Bitcoin, Long> {
}
