package com.idd.patterns.singleton;

import java.io.Serializable;

public class DateUtil_threadSafe_clone implements Serializable,Cloneable {

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil_threadSafe_clone instance;

	private DateUtil_threadSafe_clone() {

	}

	public static DateUtil_threadSafe_clone getInstance() {
		if (instance == null) {
			synchronized (DateUtil_threadSafe_clone.class) {
				if (instance == null) {
					instance = new DateUtil_threadSafe_clone();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
}
