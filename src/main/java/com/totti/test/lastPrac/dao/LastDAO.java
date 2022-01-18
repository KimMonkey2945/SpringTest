package com.totti.test.lastPrac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lastPrac.model.Last;

@Repository
public interface LastDAO {

	public List<Last> selectList();
	
	public int deleteList(@Param("id") int id);
	
	public int insertList(@Param("name") String name
					,@Param("date") String date
					,@Param("day") int day
					,@Param("headcount") int headcount
					,@Param("phoneNumber") String phoneNumber
					,@Param("state") String state);
	
	public Last selectSearchList(@Param("name") String name, @Param("phoneNumber") String phoneNumber);
}
