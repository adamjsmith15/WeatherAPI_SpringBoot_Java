package com.Lab28.WeatherAPI.WeatherAPI.entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Time {
	private String[] startPeriodName;
	
	public Time() {
		
	}

	public String[] getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(String[] startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	@Override
	public String toString() {
		return "Time [startPeriodName=" + Arrays.toString(startPeriodName) + "]";
	}
	

}
