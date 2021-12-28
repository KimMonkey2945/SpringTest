package com.totti.test.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lesson03.model.Real_estate;

@Repository
public interface Real_estateDAO {

//	public Real_estate selectReal_estate(@Param("id") int id);
	
	public Real_estate selectReal_estateRentPrice(@Param("rentPrice") int rentPrice);
	
}
