package com.example.springPRJ.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class coin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coin_name, coin_code;
    private Float price, h1, h24, d7, market_cap, volume;
    private List<Float> last_price = new ArrayList<>();

    public coin() {
    }

    public coin(String coin_name, String coin_code, Float price, Float h1, Float h24, Float d7, Float market_cap, Float volume, List<Float> last_price) {
        this.coin_name = coin_name;
        this.coin_code = coin_code;
        this.price = price;
        this.h1 = h1;
        this.h24 = h24;
        this.d7 = d7;
        this.market_cap = market_cap;
        this.volume = volume;
        this.last_price = last_price;
    }
}

