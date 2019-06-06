package com.Lab28.WeatherAPI.WeatherAPI.helper;

public class LocationHelp {
	public static String getLocationString(String city) {
		
		if(city.contains(" ")) {
			StringBuilder sb = new StringBuilder();
			String[] c = city.split(" ");
			for(int i = 0; i < c.length; i++) {
				if(i + 1 == c.length) {
					sb.append(c[i]);
				}else {
					sb.append(c[i]);
					sb.append("+");
				}
				
			}
			return sb.toString();
		}else {
			return city;
		}
		
	}

}
