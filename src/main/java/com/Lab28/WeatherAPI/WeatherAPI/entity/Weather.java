package com.Lab28.WeatherAPI.WeatherAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	
	private Location location;
	private Data data;
	private Time time;
	
	public Weather() {
		
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Weather [location=" + location + ", data=" + data + ", time=" + time + "]";
	}
	
	

}
