package com.demo.jenkinsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basiccontroller {
	@GetMapping("/get")
	public String getData() {
		return "welcome to amdocs";
	}


}
