package com.totti.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jsp_viewController {

	@RequestMapping("/lesson01/test03/1")
	public String view() {
		return"test01/test03";
	}
	
}
