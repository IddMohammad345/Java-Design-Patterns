package com.idd.patterns.flyweight;

public class Rectangle extends Shape {
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	private String label;

	public Rectangle() {
		label="Rectangle";
	}

	@Override
	public void drow(int length, Integer breadth,String fillStyle) {
		System.out.println("Drowing a "+label+" with length "+length+" Beadth "+breadth+" fillStyle "+fillStyle);
	}

}
