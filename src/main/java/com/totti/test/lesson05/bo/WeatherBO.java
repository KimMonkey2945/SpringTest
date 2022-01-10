package com.totti.test.lesson05.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson05.dao.WeatherDAO;
import com.totti.test.lesson05.model.Weather;

@Service
public class WeatherBO {
	@Autowired
	private WeatherDAO weatherDAO;
	
	public List<Weather> getWeather() {
		
		return weatherDAO.selectWeather();
	}
	
	
	public int addWeather(Date date, String weather, double tmeperature, double precipitation, String micoriDust, double windSpeed  ) {
		return weatherDAO.insertWeather(date, weather, tmeperature, precipitation, micoriDust, windSpeed);
	}
}
