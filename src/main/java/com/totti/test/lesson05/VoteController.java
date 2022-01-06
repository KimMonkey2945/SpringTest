package com.totti.test.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VoteController {

	@GetMapping("/lesson05/test04")
	public String getVoteResultView(Model model) {
		
		List<Integer> candidates = new ArrayList<>();
		candidates.add(263001);
		candidates.add(173942); 
		candidates.add(563057); 
		
		model.addAttribute("candidates", candidates);
		
		return "lesson05/vote";
		
	}
	
	
	
	@GetMapping("/lesson05/test05")
	public String getBillsView(Model model) {
		
		Date useDate = new Date();
		
		List<Map<String, Object>> cardBills = new ArrayList<>();

		Map<String, Object> cardBill = new HashMap<>();
		cardBill.put("store", "GS48");
		cardBill.put("pay", 7800);
		cardBill.put("date", "2025-09-14");
		cardBill.put("installment", "일시불");
		cardBills.add(cardBill);

		cardBill = new HashMap<>();
		cardBill.put("store", "현태백화점");
		cardBill.put("pay", 2750000);
		cardBill.put("date", "2025-09-18");
		cardBill.put("installment", "3개월");
		cardBills.add(cardBill);

		cardBill = new HashMap<>();
		cardBill.put("store", "요촌치킨");
		cardBill.put("pay", 180000);
		cardBill.put("date", "2025-09-20");
		cardBill.put("installment", "일시불");
		cardBills.add(cardBill);
		
		model.addAttribute("cardBills", cardBills);
		model.addAttribute("useDate", useDate);
		
		return "lesson05/bills";
	}
	
	
	
	
	
	
	
	
}
