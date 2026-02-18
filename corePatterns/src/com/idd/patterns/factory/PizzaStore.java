package com.idd.patterns.factory;

public class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza p=PizzaFactory.createPizza("chicken");
		
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}
}
