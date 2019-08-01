package com.tyss.hibernateapp.aws;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateAWSTest {

	public static void main(String[] args) {
		Session session = new Configuration().configure("aws.cfg.xml").buildSessionFactory().openSession();

		EmployeeNew employeeNew = new EmployeeNew();
		employeeNew.setEid(10);
		employeeNew.setEmail("rohithms002@gmail.com");
		employeeNew.setName("rohith");
		Transaction transaction = session.beginTransaction();
		session.save(employeeNew);
		transaction.commit();
	}
}
