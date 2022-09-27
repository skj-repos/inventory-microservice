package com.classpath.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryRestController {
	
	private static long counter = 1000;
	
	@GetMapping
	public long getCounter() {
		return counter;
	}

	@PostMapping
	public long updateCounter() {
		return counter--;
	}

}
