package com.tyss.hibernateapp.cache;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {

		Session session = new Configuration().configure("com/tyss/hibernateapp/cache/cache.cfg.xml")
				.buildSessionFactory().openSession();

		EmployeeNew employeeNew = session.get(EmployeeNew.class, 3);
		log.info("" + employeeNew);

		EmployeeNew employeeNew1 = session.get(EmployeeNew.class, 3);
		log.info("" + employeeNew1);

		EmployeeNew employeeNew2 = session.get(EmployeeNew.class, 3);
		log.info("" + employeeNew2);

		EmployeeNew employeeNew3 = session.get(EmployeeNew.class, 3);
		log.info("" + employeeNew3);

		Session session1 = new Configuration().configure("com/tyss/hibernateapp/cache/cache.cfg.xml")
				.buildSessionFactory().openSession();

		EmployeeNew employeeNew4 = session1.get(EmployeeNew.class, 3);
		log.info("" + employeeNew4);

		EmployeeNew employeeNew5 = session1.get(EmployeeNew.class, 3);
		log.info("" + employeeNew5);

		EmployeeNew employeeNew6 = session1.get(EmployeeNew.class, 3);
		log.info("" + employeeNew6);

		EmployeeNew employeeNew7 = session1.get(EmployeeNew.class, 3);
		log.info("" + employeeNew7);

	}
}
