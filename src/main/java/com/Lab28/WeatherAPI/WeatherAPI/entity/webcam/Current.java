package com.Lab28.WeatherAPI.WeatherAPI.entity.webcam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {
	private String icon;
	private String preview;
	
	public Current() {
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	@Override
	public String toString() {
		return "Current [icon=" + icon + ", preview=" + preview + "]";
	}
	
	
	

}
