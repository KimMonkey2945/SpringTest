package com.totti.test.lesson05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.totti.test.lesson02.bo.StoreBo;
import com.totti.test.lesson02.model.Store;
import com.totti.test.lesson05.bo.New_ReviewBO;
import com.totti.test.lesson05.model.New_Review;


@RequestMapping("/lesson05")
@Controller
public class StoreController {
	
	
	@Autowired
	private StoreBo storeBO;
	
	
	@RequestMapping("/get_Store")
	public String getStoreList(Model model){
		List<Store> store = storeBO.getStoreList();
		model.addAttribute("store", store);
		
		return "lesson05/store/store";
	}
	
	
	
	@Autowired
	private New_ReviewBO new_reviewBO;
	
	
	@RequestMapping("/get_Review")
	public String getReview(@RequestParam("storeId") int storeId, @RequestParam("name") String name, Model model) {
		
		New_Review review = new_reviewBO.getReview(storeId, name);
		
		model.addAttribute("review", review);
		
		return "store/review";
	}
	
	
	
	
	
	
	
	
}


