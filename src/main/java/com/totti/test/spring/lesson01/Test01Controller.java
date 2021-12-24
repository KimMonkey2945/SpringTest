package com.totti.test.spring.lesson01;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/test01")
@Controller
public class Test01Controller {
	
	
	@ResponseBody
	@RequestMapping("/1")
	public String projectSuccess() {
		return "<h1>테스트 프로젝트 완성</h1> 해당프로젝트를 통해서 문제풀이를 진행 합니다.";
	}

	
	@ResponseBody
	@RequestMapping("/2")
	public Map<String,Integer> score(){
		Map<String,Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		
		return map;
	}
	
	
	
}