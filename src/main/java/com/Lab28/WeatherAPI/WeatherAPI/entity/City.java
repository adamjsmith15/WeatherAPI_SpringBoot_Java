package com.Lab28.WeatherAPI.WeatherAPI.entity;



import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	@JsonProperty("Results")
	private List<HashMap<String,String>> results;
	
	public City() {
		
	}

	public List<HashMap<String, String>> getResults() {
		return results;
	}

	public void setResults(List<HashMap<String, String>> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "City [results=" + results + "]";
	}


}
