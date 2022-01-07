package com.totti.test.lesson05.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.totti.test.lesson05.model.Weather;

@Repository
public interface WeatherDAO {

	public Weather selectWeather();
}
