package com.totti.test.lesson03;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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

	// 뒷부분(다른곳의) 파라미터와는 이름이 달라도 상관없음.... 흐름을 기억하기...
	@RequestMapping("/lesson03/test01/2")
	public List<Real_estate> real_estateRentPrice(@RequestParam("rentPrice") int rentPrice) {
		return real_estateBO.getReal_estateRentPrice(rentPrice);
	}

	@RequestMapping("/lesson03/test01/3")
	public List<Real_estate> real_estateRentPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		return real_estateBO.getAreaPrice(area, price);
	}

	@RequestMapping("/lesson03/test02/1")
	public String insertTest01(@Param("realtorId") int realtorId) {
//		int count = real_estateBO.addReal_estate(3, "푸르지용리버 303동", 89, "매매", 100000);
//		return "입력 성공 :" + count;
		
		Real_estate real_estate = new Real_estate();
		real_estate.setRealtorId(realtorId);
		real_estate.setAddress("썅떼빌리버 오피스텔 814호");
		real_estate.setArea(45);
		real_estate.setType("월세");
		real_estate.setPrice(100000);
		real_estate.setRentPrice(120);
		
		int count = real_estateBO.addReal_estateAsObject(real_estate);
		return "입력성공 : " + count;
	}

}
