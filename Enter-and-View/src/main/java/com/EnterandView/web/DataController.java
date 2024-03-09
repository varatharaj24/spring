package com.EnterandView.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DataController {
	/*http://localhost:8080/Resume*/
	@GetMapping("/Resume")
	public String Resume() {
		return "index";
	}
	
	@GetMapping("/yourData")
	public String yourData(@RequestParam("uname") String name,
			               @RequestParam("uage") String age,
			               @RequestParam("ucity") String city,
			               @RequestParam("uclg") String clg,
			               Model model) {
		
		model.addAttribute("uname", name);
		model.addAttribute("uage", age);
		model.addAttribute("ucity", city);
		model.addAttribute("uclg", clg);
		
		return "profile";
	}
	
	
	
	
}
