package com.EvenNot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class DemoController {
	
	/*http://localhost:8080/evenform*/
	@GetMapping("/evenform")
	public String evenform() {
		return "eventest";
	}
	
	@GetMapping("/evenResult")
	public String evenResult(@RequestParam("number") int number,Model model) {
		model.addAttribute("number", number);
		if(number % 2 == 0) {
			model.addAttribute("result", "Even");
		}else {
			model.addAttribute("result", "not Even");
		}
		
		return "evenresult";
	}
	
	
	

}
