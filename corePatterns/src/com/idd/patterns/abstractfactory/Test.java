package com.idd.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		DaoAbstractFactory daf=DaoFactoryProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		dao.save();
	}

}
