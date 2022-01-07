package com.totti.test.lesson05.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totti.test.lesson05.dao.WeatherDAO;
import com.totti.test.lesson05.model.Weather;

@Service
public class WeatherBO {
	@Autowired
	private WeatherDAO weatherDAO;
	
	public Weather getWeather() {
		
		return weatherDAO.selectWeather();
	}
}
