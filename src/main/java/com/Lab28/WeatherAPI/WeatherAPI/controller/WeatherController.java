package com.Lab28.WeatherAPI.WeatherAPI.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.Lab28.WeatherAPI.WeatherAPI.entity.City;
import com.Lab28.WeatherAPI.WeatherAPI.entity.Weather;
import com.Lab28.WeatherAPI.WeatherAPI.helper.LocationHelp;

@Controller
public class WeatherController {
	RestTemplate restTemplate = new RestTemplate();
	
	@Value("${location.key}")
	String locationKey;
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/weather")
	public ModelAndView getWeather(@RequestParam("location") String city) {
		
		String cityString = LocationHelp.getLocationString(city);
		ModelAndView mv = new ModelAndView("weather-report");
		// get header and info for location
		HttpHeaders headersLocation = new HttpHeaders();
		headersLocation.add("X-RapidAPI-Key", locationKey);
		headersLocation.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> locationEntity = new HttpEntity<>("parameters", headersLocation);
		String locUrl = "https://devru-latitude-longitude-find-v1.p.rapidapi.com/latlon.php?location=" + cityString;
		ResponseEntity<City> locResponse = restTemplate.exchange(locUrl, HttpMethod.GET, locationEntity, City.class);
		
		
		// get headers and info for weather
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> weatherEntity = new HttpEntity<>("parameters", headers);
		String url = "https://forecast.weather.gov/MapClick.php?lat="+locResponse.getBody().getResults().get(0).get("lat")
				+"&lon="+locResponse.getBody().getResults().get(0).get("lon")+"&FcstType=json";
		ResponseEntity<Weather> response = restTemplate.exchange(url, HttpMethod.GET, weatherEntity, Weather.class);
		// add objects to model and view
		mv.addObject("loc", locResponse.getBody().getResults().get(0).get("name"));
		mv.addObject("weather", response.getBody());
		return mv;
	}

}
