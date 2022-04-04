package com.suresh.hello.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(value="/test")
	public String test() {
		return "My Test Latest";
	}

}