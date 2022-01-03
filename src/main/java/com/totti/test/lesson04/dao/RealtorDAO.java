package com.totti.test.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtorDAO {

	public int insertRealtor
	(@Param("office") String office
	,@Param("phoneNumber") String phoneNumber
	,@Param("address") String address
	,@Param("grade") String grade);
	
}
