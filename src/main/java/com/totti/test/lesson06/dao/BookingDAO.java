package com.totti.test.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lesson06.model.Booking;

@Repository
public interface BookingDAO {

	public int insertBooking(
			@Param("name") String name
			,@Param("date") String date
			,@Param("day") int day
			,@Param("headcount") int headcount
			,@Param("phoneNumber") String phoneNumber
			,@Param("state") String state);
	
	public List<Booking> selectBooking();
	
	public int deleteList(@Param("id") int id);
	
	public Booking selectReservation(@Param("name") String name, @Param("phoneNumber") String phoneNumber);
}
