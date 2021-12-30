package com.totti.test.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerDAO {

	public int insertSeller
	(@Param("nickName") String nickName
	,@Param("profileImageUrl") String profileImageUrl
	,@Param("temperature") double temperature);
}
