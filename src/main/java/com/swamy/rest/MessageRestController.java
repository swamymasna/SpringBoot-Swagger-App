package com.swamy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageRestController {

	@GetMapping("/show")
	public String showMessage() {
		return "Welcome to SpringBoot Application....!";
	}
}
