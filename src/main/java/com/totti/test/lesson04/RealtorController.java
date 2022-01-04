package com.totti.test.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.totti.test.lesson04.bo.RealtorBo;
import com.totti.test.lesson04.model.Realtor;

@Controller
public class RealtorController {
	

	@Autowired
	private RealtorBo realtorBO;
	
	@RequestMapping("/lesson04/test02/1")
	public String addRealtorView() {
		return "/test02/realtor";
	}
	
	
	@PostMapping("/lesson04/test02/add_realtor")
	public String addRealtor
	(@ModelAttribute Realtor realtor, Model model) {

		 realtorBO.addRealtor(realtor); //메서드 호출 자체에 의미가 있는것임...
		 //메서드 호출 자체에 의미가 있는것임... //메서드 호출 자체에 의미가 있는것임... //메서드 호출 자체에 의미가 있는것임... //메서드 호출 자체에 의미가 있는것임... //메서드 호출 자체에 의미가 있는것임... //메서드 호출 자체에 의미가 있는것임... //메서드 호출 자체에 의미가 있는것임...
		model.addAttribute("result", realtor);
		return "test02/realtorInfo";
	}
}
