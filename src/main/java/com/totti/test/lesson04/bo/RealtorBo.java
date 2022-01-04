package com.totti.test.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson04.dao.RealtorDAO;
import com.totti.test.lesson04.model.Realtor;

@Service
public class RealtorBo {
	
	@Autowired
	private RealtorDAO realtorDAO;
	
	public int addRealtor(Realtor realtor) {
		return realtorDAO.insertRealtor(realtor);
	}
}
