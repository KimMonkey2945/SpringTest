package com.totti.test.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson04.dao.RealtorDAO;

@Service
public class RealtorBo {
	
	@Autowired
	private RealtorDAO realtorDAO;
	
	public int addRealtor(String office, String phoneNumber, String address, String grade) {
		return realtorDAO.insertRealtor(office, phoneNumber, address, grade);
	}
}
