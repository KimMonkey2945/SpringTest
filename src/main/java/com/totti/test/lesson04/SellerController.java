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
		return "/test02/seller01";
	}
	
	
	//리턴한 것을 그대로 보여주고 싶을 때는 리스폰스바디를 사용하는것 아니면 제이슨형태인줄 알고 jsp파일을 찾음.
	@ResponseBody
	@RequestMapping("/lesson04/test01/add_seller")
	public String add_seller(
			@RequestParam("nickName") String nickName 
			,@RequestParam("profileImageUrl") String profileImageUrl 
			,@RequestParam("temperature") double temperature) 
	{int count = sellerBO.addSeller(nickName, profileImageUrl, temperature);
		return "입력성공 : " + count;}
	
	
	@RequestMapping("/lesson04/test01/seller_info")//required =false일때 래퍼클래스 파라미터 해줘야함....
	public String getSeller(Model model, @RequestParam(value="id", required = false) Integer id) {
		
		if(id==null) {
			Seller seller = sellerBO.
		}
		
		
		
		Seller seller = sellerBO.getSeller(id);
		
		model.addAttribute("title", "판매자정보");
		model.addAttribute("result", seller);
		
		return "/test02/sellerInfo";
	
	}
	
	
	
}
