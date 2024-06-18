package com.example.springPRJ.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<deal> deals;
    @ManyToMany
    private List<coin> coins;
    private List<Float> profile_volume_usd = new ArrayList<>();
    private List<Float> profile_volume_btc = new ArrayList<>();
    private Float current_volume_usd, current_volume_btc;

    public portfolio() {}

    public portfolio(List<coin> coins, List<deal> deals, List<Float> profile_volume_usd, List<Float> profile_volume_btc, Float current_volume_usd, Float current_volume_btc) {
        this.coins = coins;
        this.deals = deals;
        this.profile_volume_usd = profile_volume_usd;
        this.profile_volume_btc = profile_volume_btc;
        this.current_volume_usd = current_volume_usd;
        this.current_volume_btc = current_volume_btc;
    }
}
