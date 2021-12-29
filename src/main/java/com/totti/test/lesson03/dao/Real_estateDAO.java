package com.totti.test.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lesson03.model.Real_estate;

@Repository
public interface Real_estateDAO {

//	public Real_estate selectReal_estate(@Param("id") int id);
	
//	public Real_estate selectReal_estate(@Param("rentPrice") int rentPrice);
	
	public List<Real_estate> selectAreaPrice(@Param("area") int area, @Param("price") int price);
	
}
