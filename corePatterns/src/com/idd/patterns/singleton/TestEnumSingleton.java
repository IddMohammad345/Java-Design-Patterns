package com.idd.patterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		EnumSingltonDemo instance = EnumSingltonDemo.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Iddmohammad");
		System.out.println(instance.getName());
	}

}
