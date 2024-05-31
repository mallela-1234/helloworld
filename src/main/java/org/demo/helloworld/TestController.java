package org.demo.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/demo")
public class TestController {
	
	@GetMapping("/SayHi/{s}")
	public String printMsg(@PathVariable String s) {
		System.out.println(" Welcome to Hello world application...");
		return s;
	}

}
