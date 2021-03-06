package com.totti.test.lesson05.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.totti.test.lesson05.model.New_Review;

public interface New_ReviewDAO {

	public List<New_Review> selectStoreList();
	
	public New_Review selectReview(
			@Param("storeId") int storeId
			,@Param("name") String name);
	
	
	
}
