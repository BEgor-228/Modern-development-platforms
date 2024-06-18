package com.example.springPRJ.controller;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrjApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringPrjApplication.class, args);
		//System.exit(0);
	}
}
//при запросе в Postman http://localhost:8080/api/Bitcoin должно выводиться {"id": 12, "time": "17 июня 2024 г., 2:31:44 UTC", "usd": 66601.55}{"id": 33, "time": "17 июня 2024 г., 3:34:21 UTC", "usd": 66777.46}{"id": 52, "time": "17 июня 2024 г., 4:32:24 UTC", "usd": 66405.32}{"id": 104, "time": "17 июня 2024 г., 5:32:16 UTC", "usd": 66228.23}{"id": 152, "time": "17 июня 2024 г., 6:31:54 UTC", "usd": 66304.29} {"id": 190, "time": "17 июня 2024 г., 7:31:22 UTC", "usd": 66310.34}{"id": 212, "time": "17 июня 2024 г., 8:31:32UTC", "usd": 66429.95}{"id": 267, "time": "17 июня 2024 г., 9:32:31UTC", "usd": 66263.71}{"id": 302, "time": "17 июня 2024 г., 10:31:50 UTC", "usd": 66245.86}{"id": 352, "time": "17 июня 2024 г., 11:31:54 UTC", "usd": 66144.76}на языке java