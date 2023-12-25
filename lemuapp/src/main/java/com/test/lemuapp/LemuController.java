package com.test.lemuapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LemuController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hi";
	}

}
