package com.tyss.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {

	public static void main(String[] args) {
    log.info("1st time" + getEmployeeNewData(3));
    log.info("2nd time" + getEmployeeNewData(3));
    log.info("3rd time" + getEmployeeNewData(3));
    
	}

	private static EmployeeNew getEmployeeNewData(int id) {
		Session session = new Configuration().configure("com/tyss/hibernateapp/cache/cache.cfg.xml")
				.buildSessionFactory().openSession();
		EmployeeNew employeeNew = new EmployeeNew();
		EmployeeNew employeeNew2 =session.get(EmployeeNew.class, id);
		return employeeNew2;

	}
}
