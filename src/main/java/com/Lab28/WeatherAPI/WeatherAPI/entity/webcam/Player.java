package com.Lab28.WeatherAPI.WeatherAPI.entity.webcam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
	private Day day;
	
	public Player() {
		
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Player []";
	}
	

}
