package com.Lab28.WeatherAPI.WeatherAPI.entity.webcam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebCams {
	
	private String id;
	private String title;
	private Image image;
	private Player player;
	
	public WebCams() {
		
	}
	
	

	public Player getPlayer() {
		return player;
	}



	public void setPlayer(Player player) {
		this.player = player;
	}



	public WebCams(String id) {
		super();
		this.id = id;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "WebCam [title=" + title + ", image=" + image + "]";
	}
	
	

}
