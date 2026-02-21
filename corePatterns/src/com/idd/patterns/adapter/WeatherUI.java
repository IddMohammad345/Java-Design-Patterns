package com.idd.patterns.adapter;

public class WeatherUI {

	public void showTeamperature(int zipcode) {
		WeatherAdapter weather = new WeatherAdapter();
		System.out.println(weather.findTemperature(19406));
	}
	
	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTeamperature(19406);
	}
}
