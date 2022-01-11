package com.totti.test.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@ResponseBody
	@GetMapping("/lesson06/test01")
	public List<Site> getSite(){
		return siteBO.getSite();
	}
	
	@GetMapping("lesson06/addSiteView")
	public String siteView() {
		return "lesson06/addSite";
	}
	
	@ResponseBody
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
}
