package com.totti.test.lesson05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.totti.test.lesson02.bo.StoreBo;
import com.totti.test.lesson02.model.Store;
import com.totti.test.lesson05.model.New_Review;

@Controller
public class StoreController {
	
	
	@Autowired
	private StoreBo storeBO;
	
	
	@RequestMapping("lesson05/get_Store")
	public String getStoreList(Model model){
		List<Store> store = storeBO.getStoreList();
		model.addAttribute("store", store);
		
		return "/lesson05/store/store";
	}
	
	
	public List<New_Review> gerReview() {
		
	}
	
	
	
	
	
	
	
	
}


