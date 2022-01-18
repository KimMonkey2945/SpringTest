package com.totti.test.lastPrac.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.totti.test.lastPrac.model.Last;

@Repository
public interface LastDAO {

	public List<Last> selectList();
	
	public int deleteList();
}
