package com.example.lab1;

public class deal {
    String date;
    String type;
    float price;
    float volume;
    String coin_name;
    String coin_code;

    public deal(String date, String type, float price, float volume, String coin_name, String coin_code) {
        this.date = date;
        this.type = type;
        this.price = price;
        this.volume = volume;
        this.coin_name = coin_name;
        this.coin_code = coin_code;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getVolume() {
        return volume;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }
    public String getCoin_name() {
        return coin_name;
    }
    public void setCoin_name(String coin_name) {
        this.coin_name = coin_name;
    }
    public String getCoin_code() {
        return coin_code;
    }
    public void setCoin_code(String coin_code) {
        this.coin_code = coin_code;
    }
}


