package com.totti.test.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson04.dao.SellerDAO;

@Service
public class SellerBO {

	@Autowired
	private SellerDAO sellerDAO;
	public int addSeller(String nickName, String profileImageUrl, double temperature ) {
		return sellerDAO.insertSeller(nickName, profileImageUrl, temperature);
	}
	
}
