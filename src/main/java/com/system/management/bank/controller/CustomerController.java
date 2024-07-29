package com.system.management.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@GetMapping("/userhome")
	public String userHome()
	{
		return "Welcome to user home controller";
	}
	
	
}
