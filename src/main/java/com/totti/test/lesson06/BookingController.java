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
	
	
	//Autowired를 통해서 스프링이 객체를 생성해줌
	@Autowired
	private BookingBO bookingBO;
	
	@GetMapping("/lesson06/addBookingView")
	public String addBookingView() {
		return "lesson06/addBooking";
	}
	
	//이제는 map형태로 받기
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
		// bo에 셋팅해도 됨...
		
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
		//어떤 형태로든 규격을 만드는게 좋음....
		//성공시 {result:"success"} 이 형태 자체는 내가 직접 정의한 객체임. 이것은 직접 구조화한 데이터임. 
		//실패시 {result:"fail"} result라는 키에 담아서 전달..
		//Map<String,String> 형태로 만듬... Map으로 만들때는 Json으로 전달함
		
		
	}
	
	@GetMapping("/lesson06/searchReservationView")
	public String searchReservationView() {
		return "lesson06/checkReservation";
	}
	
	
	
	@ResponseBody
	@GetMapping("/lesson06/searchReservation")
	public Booking searchReservation(
		@RequestParam("name") String name, @RequestParam("phoneNumber") String phoneNumber) {
			
		Booking booking = bookingBO.searchReservation(name, phoneNumber);
		
		return booking;
		
	}
	
	
	
	
	
	
	
}
