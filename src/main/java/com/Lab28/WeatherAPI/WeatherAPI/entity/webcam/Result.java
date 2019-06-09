package com.Lab28.WeatherAPI.WeatherAPI.entity.webcam;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	private String total;
	@JsonProperty("webcams")
	private List<WebCams> webcams;
	
	public Result() {
		
	}

	public List<WebCams> getWebcams() {
		return webcams;
	}

	public void setWebcams(List<WebCams> webcams) {
		this.webcams = webcams;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Result [total=" + total + ", webcams=" + webcams + "]";
	}


	
	

}
