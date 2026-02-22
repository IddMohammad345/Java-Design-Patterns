package com.idd.patterns.flyweight;

public class Circle extends Shape {
	
	private String label;
	
	

	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}


	public Circle() {
		label="Circle";
	}



	@Override
	public void drow(int radius, String fillColor,String lineColor) {
		System.out.println("Drowing a "+label+" with radius "+radius+" Fill color "+fillColor+" Line Color "+lineColor);
	}

}
