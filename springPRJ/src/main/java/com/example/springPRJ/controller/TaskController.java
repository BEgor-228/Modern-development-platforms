package com.example.springPRJ.controller;

import com.example.springPRJ.model.Task;
import com.example.springPRJ.model.coin;
import com.example.springPRJ.repository.CoinRepository;
import com.example.springPRJ.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private CoinRepository coinRepository;
    @GetMapping("/coins")
    @ResponseBody
    public Iterable<coin> GET_Coins() {
        Iterable<coin> coins = coinRepository.findAll();
        return coins;
    }
    @PostMapping("/coin/add")
    @ResponseBody
    public coin ADD_Coin(@RequestBody coin coin) {
        coinRepository.save(coin);
        return coin;
    }
    @PostMapping("/tasks")
    public Task create(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}