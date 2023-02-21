package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello_World {
	
   @GetMapping("/hello")
   public String hello() {
	   return "Hello World!";
   }
   
	
}
