package com.idd.patterns.singleton;

public class DateUtil_Eager {

	private static DateUtil_Eager instance;
	
	static {
		instance=new DateUtil_Eager();
	}
	
	private DateUtil_Eager() {
		
	}
	
	public static DateUtil_Eager getInstance() {
		return instance;
	}
}
