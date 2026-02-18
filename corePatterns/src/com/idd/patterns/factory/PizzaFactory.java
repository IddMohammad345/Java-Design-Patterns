package com.idd.patterns.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equalsIgnoreCase("cheese")) {
			pizza = new CheezePizza();
		} else if (type.equalsIgnoreCase("chicken")) {
			pizza = new CheezePizza();
		} else if (type.equalsIgnoreCase("veggie")) {
			pizza = new VeggiePizza();
		}

		return pizza;
	}

}
