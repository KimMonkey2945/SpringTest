package com.totti.test.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Jstl_Test01 {

	
	@GetMapping("/lesson05/test01")
	public String jstlTest() {
		return "lesson05/jstl_Test01";
	}
	
	
	
}
