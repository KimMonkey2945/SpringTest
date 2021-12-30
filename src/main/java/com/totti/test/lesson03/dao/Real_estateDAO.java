package com.totti.test.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lesson03.model.Real_estate;

@Repository
public interface Real_estateDAO {

//	public Real_estate selectReal_estate(@Param("id") int id);
	
	public List<Real_estate> selectReal_estateRentPrice(@Param("rentPrice") int rentPrice);
	
	public List<Real_estate> selectAreaPrice(@Param("area") int area, @Param("price") int price);
	
	public int insertReal_estate(
		@Param("realtorId") int realtorId,
		@Param("address") String address,
		@Param("area") int area,
		@Param("type") String type,
		@Param("price") int price
		);
	
	public int insertReal_estateAsObject(Real_estate real_estate);
		
	
	public int updateReal_estate
			(@Param("id") int id,
			@Param("type") String type,
			@Param("price") int price
			);
	
	
	public int deleteReal_estate
		(@Param("id") int id);
	
	
	
	
	
	
	
	
	
		
}


