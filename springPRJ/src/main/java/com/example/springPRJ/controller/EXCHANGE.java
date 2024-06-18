package com.example.springPRJ.controller;

public class EXCHANGE {
    String name;
    float score;
    float volume24h;
    float markets;
    float coins;
    float last_volume[];

    public EXCHANGE(String name, Float score, Float volume24h, Float markets, Float coins, float last_volume[]) {
        this.name = name;
        this.score = score;
        this.volume24h = volume24h;
        this.markets = markets;
        this.coins = coins;
        this.last_volume = last_volume;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    public float getVolume24h() {
        return volume24h;
    }
    public void setVolume24h(float volume24h) {
        this.volume24h = volume24h;
    }
    public float getMarkets() {
        return markets;
    }
    public void setMarkets(float markets) {
        this.markets = markets;
    }
    public float getCoins() {
        return coins;
    }
    public void setCoins(float coins) {
        this.coins = coins;
    }
    public float[] getLast_volume() {
        return last_volume;
    }
    public void setLast_volume(float[] last_volume) {
        this.last_volume = last_volume;
    }
}
