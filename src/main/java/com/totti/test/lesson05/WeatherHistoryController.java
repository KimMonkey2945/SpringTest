package com.totti.test.lesson05;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totti.test.lesson05.bo.WeatherBO;
import com.totti.test.lesson05.model.Weather;

@Controller
public class WeatherHistoryController {
	
	
	@Autowired
	private WeatherBO weatherBO;
	
	//그냥 weather은 객체 하나만을 의미하는 것이 였음.... 그니까 여러개인 list가 필요함...
	@GetMapping("/lesson05/get_Weather")
	public String getWeather(Model model) {
		 
		List<Weather> weather = weatherBO.getWeather();
		 
		 model.addAttribute("weather", weather);
		 
		 return "lesson05/weather/weatherInfo";
	}
	
	
	@GetMapping("/lesson05/weatherView")
	public String weatherView() {
		return "lesson05/weather/addWeather";
	}
	
	@ResponseBody
	@GetMapping("/lesson05/add_Weather")
	public String addWeather(@RequestParam("date") String date
			,@RequestParam("weather") String weather
			,@RequestParam("temperatures") double temperatures
			,@RequestParam("precipitation") double precipitation
			,@RequestParam("microDust") String microDust
			,@RequestParam("windSpeed") double windSpeed,
			Model model) {
		int count = weatherBO.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		return   " " + count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
