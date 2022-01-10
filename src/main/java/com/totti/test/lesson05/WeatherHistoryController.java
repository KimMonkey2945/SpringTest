package com.totti.test.lesson05;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.totti.test.lesson05.bo.WeatherBO;
import com.totti.test.lesson05.model.Weather;

@Controller
public class WeatherHistoryController {
	
	
	@Autowired
	private WeatherBO weatherBO;
	
	//그냥 weather은 객체 하나만을 의미하는 것이 였음.... 그니까 여러개인 list가 필요함...
	@GetMapping("/lesson05/get_Weather")
	public String getWeather(Model model) {
		 //전체 다 가져올때는 파라미터 필요없음.
		List<Weather> weather = weatherBO.getWeather(); //여기에 있는 bo자체가 리스트가 된것임...
		 
		 model.addAttribute("weather", weather);
		 
		 return "lesson05/weather/weatherInfo";
	}
	
	
	@GetMapping("/lesson05/weatherView")
	public String weatherView() {
		return "lesson05/weather/addWeather";
	}
	
	
	@GetMapping("/lesson05/add_Weather")
	public String addWeather
		( @DateTimeFormat(pattern="yyyy-MM-dd") //바로위에 입력...       이렇게 말고 객체를 사용할 때는 직접 모델위에 똑같은 어노테이션을 해준다...
		@RequestParam(value="date") Date date
		,@RequestParam("weather") String weather
		,@RequestParam("temperatures") String temperatures
		,@RequestParam("precipitation") double precipitation
		,@RequestParam("microDust") String micoriDust
		,@RequestParam("windSpeed") double windSpeed
			) {
		weatherBO.addWeather(date, weather, windSpeed, precipitation, micoriDust, windSpeed);
		
		return "redirect:/lesson05/get_Weather";
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
