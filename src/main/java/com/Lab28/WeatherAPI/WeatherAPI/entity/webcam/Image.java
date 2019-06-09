package com.Lab28.WeatherAPI.WeatherAPI.entity.webcam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
	private Current current;
	
	public Image() {
		
	}

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

	@Override
	public String toString() {
		return "Image [current=" + current + "]";
	}

}
