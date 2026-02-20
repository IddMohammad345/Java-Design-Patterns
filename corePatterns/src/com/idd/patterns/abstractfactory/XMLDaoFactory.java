package com.idd.patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;

		if (type.equalsIgnoreCase("emp")) {
			dao = new XMLEmpDao();
		} else if (type.equalsIgnoreCase("dept")) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

}
