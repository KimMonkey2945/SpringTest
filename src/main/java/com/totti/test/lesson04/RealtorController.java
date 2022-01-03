package com.totti.test.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totti.test.lesson04.bo.RealtorBo;

@Controller
public class RealtorController {
	

	@Autowired
	private RealtorBo realtorBO;
	
	@RequestMapping("/lesson04/test02/1")
	public String addRealtorView() {
		return "/test02/realtor";
	}
	
	@ResponseBody
	@RequestMapping("/lesson04/test02/add_realtor")
	public String addRealtor
	(@RequestParam("office") String office
	,@RequestParam("phoneNumber") String phoneNumber
	,@RequestParam("address") String address
	,@RequestParam("grade") String grade
			) {
		int count = realtorBO.addRealtor(office, phoneNumber, address, grade);
		return "입력성공 : " + count;
	}
}
