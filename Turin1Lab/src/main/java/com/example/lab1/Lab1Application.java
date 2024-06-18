package com.example.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

}
//при запросе в Postman http://localhost:8080/api/Bitcoin должно выводиться {"id": 352, "time": "17 июня 2024 г., 11:31:54 UTC", "usd": 66162.11} на языке java