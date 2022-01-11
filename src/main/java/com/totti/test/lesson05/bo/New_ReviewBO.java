package com.totti.test.lesson05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson05.dao.New_ReviewDAO;
import com.totti.test.lesson05.model.New_Review;

@Service
public class New_ReviewBO {
	
	@Autowired
	private New_ReviewDAO new_RiviewDAO;
	
	public List<New_Review> getStore() {
		return new_RiviewDAO.selectStoreList();
	}
	
	public New_Review getReview(int storeId, String name) {
		return new_RiviewDAO.selectReview(storeId, name);
	}

}
