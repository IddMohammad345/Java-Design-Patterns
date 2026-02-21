package com.idd.patterns.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipCode) {
		String city=null;
		if (zipCode==19406) {
			city="King of Prussia";
		}
		WeatherFinder finder = new WeatherFinderImpl();
		int temp = finder.find(city);
		return temp;
	}
}
