package com.webapp.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Configuration {
@GetMapping("/hello")	
public String Hello() {
	return "Hello World!";
	
}
}
