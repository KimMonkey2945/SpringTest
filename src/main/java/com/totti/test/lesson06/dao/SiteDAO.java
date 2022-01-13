package com.totti.test.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.totti.test.lesson06.model.Site;

public interface SiteDAO {

	
	public List<Site> selectSite();
	
	public int insertSite
	(@Param("name") String name
	,@Param("address") String address);
	
	public int selectDuplicateCount(@Param("address") String address);
	
	public int deleteSite(@Param("name") String name);
}
