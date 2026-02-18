package com.idd.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

	public static void main(String[] args) {
		DateUtil_threadSafe_clone instance1=DateUtil_threadSafe_clone.getInstance();
		DateUtil_threadSafe_clone instance2=null;
		
		Constructor[] constructors = DateUtil_threadSafe_clone.class.getDeclaredConstructors();
		
		for (Constructor constructor: constructors) {
			constructor.setAccessible(true);
			try {
				instance2=(DateUtil_threadSafe_clone) constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
