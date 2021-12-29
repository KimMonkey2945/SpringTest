package com.totti.test.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.totti.test.lesson03.bo.Real_estateBO;
import com.totti.test.lesson03.model.Real_estate;

@RestController
public class Real_estateController {
	
	@Autowired
	private Real_estateBO real_estateBO;
	
//	@RequestMapping("/lesson03/test01/1")
//	public Real_estate real_estate(@RequestParam(value="id", required = false, defaultValue="5") int id){
//		return real_estateBO.getreal_estate(id);
//	}
	
//	@RequestMapping("/lesson03/test01/2")
//	public List<Real_estate> real_estateRentPrice(@RequestParam("rentPrice") int rentPrice) {	
//		return real_estateBO.getReal_estateRentPrice(rentPrice);
//	}
	
	@RequestMapping("/lesson03/test01/3")
	public List<Real_estate> real_estateRentPrice(@RequestParam("area") int area, @RequestParam("price") int price) {	
		return  real_estateBO.getAreaPrice(area, price);
	}
	
}
