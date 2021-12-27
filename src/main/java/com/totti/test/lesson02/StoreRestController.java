package com.totti.test.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totti.test.lesson02.bo.StoreBo;
import com.totti.test.lesson02.model.Store;

@RestController
public class StoreRestController {
	
	@Autowired
	private StoreBo storeBo;
	@RequestMapping("/lesson02/test01")
	public List<Store> store(){
		return storeBo.getStoreList();
	}
	
}
