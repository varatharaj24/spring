package com.postmethod.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	/*http://localhost:8080/login*/
	@GetMapping("/login")
	public String login() {
		return "index";
	}
	
	@PostMapping("/msg")
	public String msg(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		
		return "message";
	}
	

	
}
