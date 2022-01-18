package com.totti.test.lastPrac;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totti.test.lastPrac.bo.LastBO;
import com.totti.test.lastPrac.model.Last;



@Controller
public class LastController {

	@Autowired
	private LastBO lastBO;
	
	@GetMapping("/lastPrac/showList")
	public String getList(Model model){
		List<Last> result = lastBO.getList();
		model.addAttribute("result", result);
	
		return "/last/lastList";
	}
	
	@ResponseBody
	@GetMapping("/lastPrac/deleteList")
	public Map<String, String> deleteList(int id){
		 
		Map<String, String> map = new HashMap<>();
		int count = lastBO.deleteLinst(id);
		 
		if(count == 1) {
			map.put("success", "true");
		}else {
			map.put("success", "fail");
		}
		
		return map;
		
	}
}
