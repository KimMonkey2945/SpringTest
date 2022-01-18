package com.totti.test.lastPrac;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totti.test.lastPrac.bo.LastBO;
import com.totti.test.lastPrac.model.Last;

@Controller
public class LastController {

	@Autowired
	private LastBO lastBO;
	
	@GetMapping("/lastPrac/showList")
	public String getList(Model model){
		List<Last> result = lastBO.getList();
		model.addAttribute("result", result);
	
		return "/last/lastList";
	}
}
