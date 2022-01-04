package com.totti.test.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lesson04.model.Seller;

@Repository
public interface SellerDAO {

	public int insertSeller(
			@Param("nickName") String nickName
			,@Param("profileImageUrl") String profileImageUrl
			,@Param("temperature") double temperature);
	
	public Seller selectLastSeller();
	
	public Seller selectSeller(@Param("id") int id);
}
