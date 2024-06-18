package com.example.springPRJ.controller;

import com.example.springPRJ.model.*;
import com.example.springPRJ.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controllers {
    @Autowired
    private CoinRepository coin_repository;
    @Autowired
    private ExchangeRepository exchange_repository;
    @Autowired
    private DealRepository deal_repository;
    @Autowired
    private PortfolioRepository portfolio_repository;
    @Autowired
    private TrendRepository trend_repository;

    @GetMapping("/coins")
    @ResponseBody
    public Iterable<coin> GET_Coins() {
        Iterable<coin> coins = coin_repository.findAll();
        return coins;
    }
    @PostMapping("/coin/add")
    @ResponseBody
    public coin ADD_Coin(@RequestBody coin coin) {
        coin_repository.save(coin);
        return coin;
    }

    @GetMapping("/exchanges")
    @ResponseBody
    public Iterable<exchange> GET_Exchanges() {
        Iterable<exchange> exchanges = exchange_repository.findAll();
        return exchanges;
    }
    @PostMapping("/exchange/add")
    @ResponseBody
    public exchange ADD_Exchange(@RequestBody exchange exchange) {
        exchange_repository.save(exchange);
        return exchange;
    }

    @GetMapping("/portfolio/{id}")
    @ResponseBody
    public portfolio GET_Portfolio(@PathVariable Long id) {
        return portfolio_repository.findById(id).orElse(null);
    }
    @PostMapping("/portfolio/add")
    @ResponseBody
    public portfolio ADD_Portfolio(@RequestBody portfolio portfolio){
        portfolio_repository.save(portfolio);
        return portfolio;
    }

    @GetMapping("/trends")
    @ResponseBody
    public Iterable<trend> GET_Trends() {
        Iterable<trend> trends = trend_repository.findAll();
        return trends;
    }
    @PostMapping("/trend/add")
    @ResponseBody
    public trend ADD_Trend(@RequestBody coin COIN) {
        COIN coin = coin_repository.findById(coin.getId()).orElse(null);
        if (coin != null) {
            trend trend = new trend(coin.getCoin_name(), coin.getCoin_code(), coin.getH24());
            trend_repository.save(trend);
            return trend;
        } else {
            return null;
        }
    }

    @PostMapping("/portfolio/{id}/add-deal")
    @ResponseBody
    public deal ADD_Deal(@PathVariable Long id, @RequestBody deal DEALS) {
        portfolio portfolio = portfolio_repository.findById(id).orElse(null);
        if (portfolio != null) {
            portfolio.getDeals().add(DEALS);
            deal_repository.save(DEALS);
            portfolio_repository.save(portfolio);
            return DEALS;
        }
        else {
            return null;
        }
    }
    @PostMapping("/portfolio/{id}/add-coin")
    @ResponseBody
    public COIN ADD_Coin(@PathVariable Long id, @RequestBody COIN COIN) {
        portfolio portfolio = portfolio_repository.findById(id).orElse(null);
        if (portfolio != null) {
            com.example.springPRJ.controller.COIN coin = coin_repository.findById(COIN.getId()).orElse(null);
            if (coin != null) {
                portfolio.getCoins().add(coin);
                portfolio_repository.save(portfolio);
                return coin;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
