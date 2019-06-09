package com.Lab28.WeatherAPI.WeatherAPI.entity.webcam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebCamHolder {
	private Result result;
	
	public WebCamHolder() {
		
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "WebCamHolder [result=" + result + "]";
	}
	

}
