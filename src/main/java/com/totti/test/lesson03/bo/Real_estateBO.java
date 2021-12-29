package com.totti.test.lesson03.bo;

import java.util.List;

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

	public List<Real_estate> getReal_estateRentPrice(int rentPrice) {
		return real_estateDAO.selectReal_estateRentPrice(rentPrice);		
		
	}

	public List<Real_estate> getAreaPrice(int area, int price) {
		return real_estateDAO.selectAreaPrice(area, price);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public Real_estate getInsertReal_estate(Real_estate real_estate) {
//		return  real_estateDAO.insertReal_estate(real_estate);
//	
//	}

}
