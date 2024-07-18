package com.firstspringdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController 	//(@Controller + @RequestBody)
public class HelloController {

	@RequestMapping ("/hello")
	@GetMapping ("/hello")
	public void helloWorld() 
	{
		System.out.println("Hello Spring Boot");
	}	
	
	@RequestMapping ("/bye")
	public void goodByWorld() 
	{
		System.out.println("Bye Spring Boot");
	}
	
}
