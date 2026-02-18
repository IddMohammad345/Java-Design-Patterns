package com.idd.patterns.singleton;

public enum EnumSingltonDemo {

	INSTANCE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
