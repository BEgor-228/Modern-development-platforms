package com.example.springPRJ.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class trend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coin_name, coin_code;
    private Float h24;

    public trend() {}

    public trend(String coin_name, String coin_code, Float h24) {
        this.coin_name = coin_name;
        this.coin_code = coin_code;
        this.h24 = h24;
    }
}
