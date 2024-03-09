package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;


@Controller
public class HelloController {
	
	/*http://localhost:8080/*/
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "<h1>Hai Thare this is my web<h1>";
	}
	/*http://localhost:8080/add/a/b*/
	@GetMapping("/add/{a}/{b}")
	@ResponseBody
	public int add(@PathVariable("a") int a,@PathVariable("b") int b) {
		return a+b;
	}
	
	/*http://localhost:8080/adition?a=10&b=10*/
	@GetMapping("/adition")
	@ResponseBody
	public int adition(@RequestParam("a") int a,@RequestParam("b") int b) {
		return a+b;
	}
	
	
	/*http://localhost:8080/greeting*/
	@GetMapping("/greeting")
	@ResponseBody
	public String greeting() {
		return" Hello World!!!";
	}
	
	/*http://localhost:8080/welcome*/
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
}
