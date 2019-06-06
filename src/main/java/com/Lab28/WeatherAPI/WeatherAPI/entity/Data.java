package com.Lab28.WeatherAPI.WeatherAPI.entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	private double[] temperature;
	private String[] weather;
	private String[] text;
	
	public Data() {
		
	}

	public double[] getTemperature() {
		return temperature;
	}

	public void setTemperature(double[] temperature) {
		this.temperature = temperature;
	}

	public String[] getWeather() {
		return weather;
	}

	public void setWeather(String[] weather) {
		this.weather = weather;
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Data [temperature=" + Arrays.toString(temperature) + ", weather=" + Arrays.toString(weather) + ", text="
				+ Arrays.toString(text) + "]";
	}
	

}
