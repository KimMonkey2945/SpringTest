package com.totti.test.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson03.dao.Real_estateDAO;
import com.totti.test.lesson03.model.Real_estate;

@Service
public class Real_estateBO {
	
	@Autowired
	private Real_estateDAO real_estateDAO;
	
//	public Real_estate getreal_estate(int id) {
//		return real_estateDAO.selectReal_estate(id);
//	}
	
	public Real_estate getReal_estateRentPrice(int rentPrice) {
		return real_estateDAO.selectReal_estateRentPrice(rentPrice);
	}
}
