package com.totti.test.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totti.test.lesson04.bo.SellerBO;
import com.totti.test.lesson04.model.Seller;

@Controller
public class SellerController {
	
	@Autowired
	private SellerBO sellerBO;

	@RequestMapping("/lesson04/test01/1")
	public String addSellerView() {
		return "test01/seller01";
	}
	
	@ResponseBody
	@RequestMapping("/lesson04/test01/add_seller")
	public String addSeller
	(@RequestParam("nickName") String nickName
	,@RequestParam("profileImageUrl") String profileImageUrl
	,@RequestParam("temperature") double temperature
			) {
		int count = sellerBO.addSeller(nickName, profileImageUrl, temperature);
		
		return "입력성공 : " + count;
	}
	
//	@RequestMapping("/lesson04/test01/seller_info")
//	public String getSeller(Model model) {
//		Seller seller = sellerBO.getLastSeller();
//		model.addAttribute("result", seller);
//		model.addAttribute("title", "판매자정보");
//		
//		return "test01/sellerInfo";
//	}
	// 비 필수 파라미터는 래퍼클래스로 표시해줘야함.....
	@RequestMapping("/lesson04/test01/seller_info")
	public String getSeller(Model model, @RequestParam(value="id", required=false) Integer id ) {
		if(id == null) {
			Seller seller = sellerBO.getLastSeller();
			model.addAttribute("title", "판매자정보");
			model.addAttribute("result", seller);
		}else {
			Seller seller = sellerBO.getSeller(id);
			model.addAttribute("title", "판매자정보");
			model.addAttribute("result", seller);
		}
		
		return "test01/sellerInfo";
	}
}
