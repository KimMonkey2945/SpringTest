package com.totti.test.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totti.test.lesson06.bo.BookingBO;
import com.totti.test.lesson06.model.Booking;

@Controller
public class BookingController {
	
	@Autowired
	private BookingBO bookingBO;
	
	@GetMapping("/lesson06/addBookingView")
	public String addBookingView() {
		return "lesson06/addBooking";
	}
	
	@ResponseBody
	@GetMapping("/lesson06/addBooking")
	public String addBooking(
			@RequestParam("name") String name
			,@RequestParam("date") String date
			,@RequestParam("day") int day
			,@RequestParam("headcount") int headcount
			,@RequestParam("phoneNumber") String phoneNumber
			){
		
		String state = "대기중";
		
		
		int count = bookingBO.addBooking(name, date, day, headcount, phoneNumber, state);
		
		if(count == 1) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	
	@GetMapping("/lesson06/bookingList")
	public String getBookingList(Model model){
		
		List<Booking> booking = bookingBO.getBookingList();
		model.addAttribute("booking", booking);
		
		return "lesson06/bookingList";
		
	}
	
	
	
	@ResponseBody
	@GetMapping("/lesson06/deleteList")
	public String deleteList(@RequestParam("id") int id) {
		
		int count = bookingBO.deleteList(id);
		
		if(count == 0) {
			return "fail";
		}else {
			return "success";
		}
		
	}
	
	@GetMapping("/lesson06/searchReservationView")
	public String searchReservationView() {
		return "lesson06/checkReservation";
	}
	
	
	
	@ResponseBody
	@GetMapping("/lesson06/searchReservation")
	public String  searchReservation(
		@RequestParam("name") String name, @RequestParam("phoneNumber") String phoneNumber) {
			
		
			if(bookingBO.searchReservation(name, phoneNumber)) {
				return "confirm";
			}else {
				return"notExist";
			}
		
		
		
		
		
		
//		Map<String,String> result = new HashMap<>();
//		
//		if(bookingBO.searchReservation(name, phoneNumber)) {
//			result.put("searchReservation", "true");
//		}else {
//			result.put("searchReservation", "false");
//		}
//		
//		return result;
		
	}
	
	
	
	
	
	
	
}
