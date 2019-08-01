package com.tyss.hibernateapp.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.bean.EmployeeEducationalInfoBean;
import com.tyss.hibernateapp.bean.EmployeeInfoBean;

public class EducationEmployeeInfoTest {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		EmployeeInfoBean employeeBean = new EmployeeInfoBean();
		employeeBean.setId(40);
		employeeBean.setName("Spoorthy");
		employeeBean.setAccountNumber("5514511222");
		employeeBean.setAge(24);
		employeeBean.setDob(java.sql.Date.valueOf("1992-02-05"));
		employeeBean.setEmail("Spoorthy@testyantra.com");
		employeeBean.setGender("Female");
		employeeBean.setJoiningDate(java.sql.Date.valueOf("2015-02-05"));
		employeeBean.setMngrId(3);
		employeeBean.setDesignation("SE");
		employeeBean.setPhone(92534722);
		employeeBean.setSalary(25000);

		EmployeeEducationalInfoBean educationBean = new EmployeeEducationalInfoBean();
		educationBean.setCollegeName("PES College");
		educationBean.setEducationType("Full");
		educationBean.setLocation("Bangalore");
		educationBean.setUniversity("VTU");
		educationBean.setPercentage(90.5);
		educationBean.setYop(2012);
		educationBean.setEmployeeInfoBean(employeeBean);

		EmployeeEducationalInfoBean educationBean1 = new EmployeeEducationalInfoBean();
		educationBean1.setCollegeName("PES College");
		educationBean1.setEducationType("part_time");
		educationBean1.setLocation("Bangalore");
		educationBean1.setUniversity("VTU");
		educationBean1.setPercentage(90.5);
		educationBean1.setYop(2012);
		educationBean.setEmployeeInfoBean(employeeBean);

		Transaction transact = session.beginTransaction();
		session.save(educationBean);
		session.save(educationBean1);
		transact.commit();

	}
}
