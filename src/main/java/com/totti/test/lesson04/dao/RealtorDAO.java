package com.totti.test.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lesson04.model.Realtor;

@Repository
public interface RealtorDAO {

	public int insertRealtor(Realtor realtor);
	
}
