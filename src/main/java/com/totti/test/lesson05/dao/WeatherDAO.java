package com.totti.test.lesson05.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.totti.test.lesson05.model.Weather;

@Repository
public interface WeatherDAO {

	public List<Weather> selectWeather();
	
	public int insertWeather(
			@RequestParam("date") String date
			,@RequestParam("weather") String weather
			,@RequestParam("temperatures") double temperatures
			,@RequestParam("precipitation") double precipitation
			,@RequestParam("microDust") String microDust
			,@RequestParam("windSpeed") double windSpeed);
}
