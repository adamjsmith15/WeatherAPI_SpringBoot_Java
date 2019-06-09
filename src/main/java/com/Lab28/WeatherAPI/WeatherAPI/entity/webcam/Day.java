package com.Lab28.WeatherAPI.WeatherAPI.entity.webcam;

public class Day {
	private String live;
	private String embed;
	
	public Day() {
		
	}

	public String getLive() {
		return live;
	}

	public void setLive(String live) {
		this.live = live;
	}

	public String getEmbed() {
		return embed;
	}

	public void setEmbed(String embed) {
		this.embed = embed;
	}

	@Override
	public String toString() {
		return "Day [live=" + live + ", embed=" + embed + "]";
	}

}
