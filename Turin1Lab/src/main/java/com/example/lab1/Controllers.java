package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controllers {
    List<coin> coins = new ArrayList<>();
    List<trend> trends = new ArrayList<>();
    List<exchange> exchanges = new ArrayList<>();
    List<deal> deals = new ArrayList<>();
    portfolio PORTFOLIO = new portfolio();

    public Controllers () {
        coins.add(new coin("Bitcoin", "BTC", 50000f, -25f, 23f, 56f, 2303534050432.0, 4395723867.0, new float[]{324f, 436f, 584f, 987f, 674f}));
        PORTFOLIO.add_coin("Bitcoin", "BTC", 50.087876f, -25f, 23f, 56f, 2303534050432.0, 4395723867.0, new float[]{324f, 436f, 584f, 987f, 674f});
        exchanges.add(new exchange("Binance", 9.0f, 364578658725f, 67f, 45f, new float[]{324f,436f,584f,987f,674f}));
        trends.add(new trend("Bitcoin", "BTC", 23.0f));
        deals.add(new deal("2024-02-02T12:33:33", "sell", 3543256, 3, "Bitcoin", "BTC"));
        PORTFOLIO.add_deal("2024-02-02T12:33:33", "sell", 3543256, 3, "Bitcoin", "BTC");
    }
    @GetMapping("/coins")
    public List<coin> GET_coins() {
        return coins;
    }
    @GetMapping("/trends")
    public List<trend> GET_trends() {
        return trends;
    }
    @GetMapping("/exchanges")
    public List<exchange> GET_exchanges() {
        return exchanges;
    }
    @GetMapping("/portfolio")
    public portfolio GET_portfolio() {
        return PORTFOLIO;
    }
    @PostMapping("/add-deal")
    public deal POST_deal() {
        return PORTFOLIO.deals.getLast();
    }
}

