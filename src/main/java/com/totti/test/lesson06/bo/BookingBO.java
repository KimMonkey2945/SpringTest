package com.totti.test.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson06.dao.BookingDAO;
import com.totti.test.lesson06.model.Booking;

@Service
public class BookingBO {

	@Autowired
	private BookingDAO bookingDAO;
	
	public int addBooking(String name, String date, int day, int headcount, String phoneNumber, String state) {
		return bookingDAO.insertBooking(name, date, day, headcount, phoneNumber, state);
	}
	
	public List<Booking> getBookingList(){
		return bookingDAO.selectBooking();
	}
	
	public int deleteList(int id) {
	
		return bookingDAO.deleteList(id);
	}
	
	public boolean searchReservation(String name, String phoneNumber) {
	int count =	bookingDAO.selectReservation(name, phoneNumber);
	
		if(count == 1) {
			return true;
		}else{
			return false;
		}
	
	}
}
