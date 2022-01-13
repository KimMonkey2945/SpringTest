package com.totti.test.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson06.dao.SiteDAO;
import com.totti.test.lesson06.model.Site;

@Service
public class SiteBO {

	@Autowired
	private SiteDAO siteDAO;

	public List<Site> getSite() {
		return siteDAO.selectSite();
	}

	public int addSite(String name, String address) {
		return siteDAO.insertSite(name, address);
	}

	public boolean checkDuplicate(String address) {
		int count = siteDAO.selectDuplicateCount(address);

		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

	public int deleteAddress(String name) {
		return siteDAO.deleteSite(name);
	}

}
