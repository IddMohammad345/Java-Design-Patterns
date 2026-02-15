package com.idd.patterns.singleton;

public class DateUtil_threadSafe {
	private static DateUtil_threadSafe instance;
	
	private DateUtil_threadSafe() {
		
	}

	public static DateUtil_threadSafe getInstance() {
		synchronized (DateUtil_threadSafe.class) {
			if (instance == null) {
				instance= new DateUtil_threadSafe();
			}
		}
		return instance;
	}
}
