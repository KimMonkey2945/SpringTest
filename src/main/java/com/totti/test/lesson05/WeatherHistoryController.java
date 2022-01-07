package com.totti.test.lesson05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.totti.test.lesson05.bo.WeatherBO;
import com.totti.test.lesson05.model.Weather;

@Controller
public class WeatherHistoryController {
	
	@GetMapping("/lesson05/weatherView")
	public String getWeatherView() {
		return "lesson05/weather/addWeather";
	}

	@Autowired
	private WeatherBO weatherBO;
	
	@GetMapping("/lesson05/weather")
	public String getWeather(Model model) {
		
		Weather weather = weatherBO.getWeather();
		model.addAttribute("weather", weather);
		
		return "lesson05/weatherInfo";
		
	}
	
	
}
