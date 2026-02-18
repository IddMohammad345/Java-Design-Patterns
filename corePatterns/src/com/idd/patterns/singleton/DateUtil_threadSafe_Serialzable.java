package com.idd.patterns.singleton;

import java.io.Serializable;

public class DateUtil_threadSafe_Serialzable implements Serializable {

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil_threadSafe_Serialzable instance;

	private DateUtil_threadSafe_Serialzable() {

	}

	public static DateUtil_threadSafe_Serialzable getInstance() {
		if (instance == null) {
			synchronized (DateUtil_threadSafe_Serialzable.class) {
				if (instance == null) {
					instance = new DateUtil_threadSafe_Serialzable();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
}
