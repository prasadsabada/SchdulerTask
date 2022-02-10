package com.example.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

	@GetMapping("/")
	public String test() {
		return "hello";
		
	}
	@PostMapping("/")
	public String postTest() {
		return "hello world";
		
	}
}
