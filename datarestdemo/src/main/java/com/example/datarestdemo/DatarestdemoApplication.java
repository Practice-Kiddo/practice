package com.example.datarestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DatarestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatarestdemoApplication.class, args);
	}
    @GetMapping("hello")
	public String hel()
	{
		return "welcome to spring boot";
	}
	@GetMapping("helloo")
	public String hello()
	{
		return "welcome to spring bootttt!!!!!!!";
	}
}
