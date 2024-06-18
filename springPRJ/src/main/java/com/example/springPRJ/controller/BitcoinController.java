package com.example.springPRJ.controller;

import com.example.springPRJ.repository.BitcoinRepository;
import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.stream.StreamSupport;

public class BitcoinController {
    @GetMapping("/Current_Bitcoin")
    @ResponseBody
    public Bitcoin getBitcoin(){

        @Autowired
        private BitcoinRepository bitcoinRepository;

        @Scheduled(fixedRate = 3600000) // saves a new Bitcoin object every hour
        public Bitcoin getBitcoins() {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity("https://api.coindesk.com/v1/bpi/currentprice.json", String.class);
            String json = response.getBody();
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(json).getAsJsonObject();
            String time = jsonObject.getAsJsonObject("time").get("updated").getAsString();
            Double usd = jsonObject.getAsJsonObject("bpi").getAsJsonObject("USD").get("rate_flo at").getAsDouble();
            Bitcoin newBitcoin = new Bitcoin(time, usd);
            if (bitcoinRepository.count() == 10) {
                Iterable<Bitcoin> bitcoins = bitcoinRepository.findAll();
                Bitcoin[] bitcoinArray = StreamSupport.stream(bitcoins.spliterator(), false).toArray(Bitcoin[]::new);
                Bitcoin oldBitcoin = bitcoinArray[0];
                bitcoinRepository.deleteById(oldBitcoin.getId());
            }
            bitcoinRepository.save(newBitcoin);
            return newBitcoin;
        }
    }
    @GetMapping("/Bitcoin")
    @ResponseBody
    public Iterable<Bitcoin> getBitcoins(){
        Iterable<Bitcoin> bitcoins = BitcoinRepository.findAll();
        return bitcoins;
    }
}
