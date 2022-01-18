package com.totti.test.lastPrac.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lastPrac.dao.LastDAO;
import com.totti.test.lastPrac.model.Last;

@Service
public class LastBO {

	@Autowired
	private LastDAO lastDAO;
	
	public List<Last> getList(){
		return lastDAO.selectList();
	}
	
	public int deleteLinst(int id) {
		return lastDAO.deleteList();
	}
	
}
