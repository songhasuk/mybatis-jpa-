package com.nowon.shs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	
	@GetMapping("/signup")
	public String signup() {
		
		return "view/common/signup";
	}

}
