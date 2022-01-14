package com.totti.test.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totti.test.lesson06.bo.SiteBO;
import com.totti.test.lesson06.model.Site;

@Controller
public class SiteController {

	@Autowired
	private SiteBO siteBO;
	
	
	@GetMapping("/lesson06/addSiteView")
	public String siteView() {
		return "lesson06/addSite";
	}
	
	@ResponseBody //api는 형식으로 다시 전달해주는것
	@PostMapping("/lesson06/test01/1")
	public String addSite
	(@RequestParam("name") String name
	,@RequestParam("address") String address) 
	{
		int count = siteBO.addSite(name, address);
	
		if(count == 1) {
			return "success";
		}else {
			return "fail";
		}
		
//		return "입력성공: " + count;
	}
	
	@GetMapping("/lesson06/test01")
	public String getSite(Model model){
		List<Site> site =  siteBO.getSite();
		
		model.addAttribute("site", site);
		return "lesson06/siteList";
	}
	
	@ResponseBody
	@GetMapping("/lesson06/duplicateAddress")
	public Map<String, String> checkDuplicate(@RequestParam("address") String address){
		
		Map<String, String> result = new HashMap<>();
		
		if(siteBO.checkDuplicate(address)) {
			result.put("isDuplicate", "true");
		}else {
			result.put("isDuplicate", "false");
		}
		
		return result;
	}
	
	
	@ResponseBody
	@GetMapping("lesson06/deleteAddress")
	public String deleteAddress(@RequestParam("id") int id){
		
		int count = siteBO.deleteAddress(id);
		
		if(count == 1) {
			return "success";
		}else {
			return "fail";
		}
		
		
	}
	
	
	
	
}
