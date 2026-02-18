package com.idd.patterns.factory;

public class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza p=null;
		
		if(type.equalsIgnoreCase("cheese")) {
			p=new CheezePizza();
		}else if (type.equalsIgnoreCase("chicken")) {
			p=new ChickenPizza();
		}else if (type.equalsIgnoreCase("Veggie")) {
			p=new VeggiePizza();
		}
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}
}
