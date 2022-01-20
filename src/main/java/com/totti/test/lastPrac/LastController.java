package com.totti.test.lastPrac;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Map<String, String> deleteList(Model model, int id){
		 
		Map<String, String> map = new HashMap<>();
		 lastBO.deleteLinst(id);
		 
		map.put("map", "success"); 
		
		
		return map;
	}
	
	@GetMapping("/lastPrac/addListView")
	public String addListView() {
		return "/last/lastAdd";
	}
	
	
	@ResponseBody
	@GetMapping("/lastPrac/addList")
	public Map<String, String> addList(@RequestParam("name") String name
										,@RequestParam("date") String date
										,@RequestParam("day") int day
										,@RequestParam("headcount") int headcount
										,@RequestParam("phoneNumber") String number
										){
		
		lastBO.addList(name, date, day, headcount, number);
		
		Map<String, String> result = new HashMap<>();
		result.put("success", "true");
		
		return result;
	}
	
	@GetMapping("/lastPrac/main")
	public String getMain() {
		return "last/lastSearch";
	}
	
	
	
	@ResponseBody
	@GetMapping("/lastPrac/search")
	public Map<String, Object> searchList(@RequestParam("name") String name, @RequestParam("phoneNumber") String phoneNumber) {
		Map<String, Object> map = new HashMap<>();
		
		Last last = lastBO.searchList(name, phoneNumber);
		// 조회된 데이터가 없으면 객체는 null
		// 데이터를 가져올때는 새로 만들 필요 없음 
		
		if(last == null) {
			map.put("result", "fail");
		}else {
			map.put("result", "success");
			map.put("last", last);
		}
		
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
