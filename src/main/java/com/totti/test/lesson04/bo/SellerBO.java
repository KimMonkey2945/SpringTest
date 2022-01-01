package com.totti.test.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson04.dao.SellerDAO;
import com.totti.test.lesson04.model.Seller;

@Service
public class SellerBO {

	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickName, String profileImageUrl, double temperature ) {
		return sellerDAO.insertSeller(nickName, profileImageUrl, temperature);
	}
	
	public Seller getSeller(int id) {
		return sellerDAO.selectSeller(id);
	}
}
