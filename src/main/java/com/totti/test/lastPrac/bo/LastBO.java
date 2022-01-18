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
	
	public void deleteLinst(int id) {
		 lastDAO.deleteList(id);
	}
	
	public void addList(String name, String date, int day, int headcount, String phoneNumber) {
		lastDAO.insertList(name, date, day, headcount, phoneNumber, "대기중");
	}
	
	public Last searchList(String name, String phoneNumber) {
		return lastDAO.selectSearchList(name, phoneNumber);
	}
}
