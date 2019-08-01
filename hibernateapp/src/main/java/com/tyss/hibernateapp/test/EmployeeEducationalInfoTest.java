package com.tyss.hibernateapp.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.bean.EmployeeEducationalInfoBean;

public class EmployeeEducationalInfoTest {

	public static void main(String[] args) {
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		EmployeeEducationalInfoBean empEducationBean= new EmployeeEducationalInfoBean();
		
		empEducationBean.setId(4);
		empEducationBean.setCollegeName("PES College");
		empEducationBean.setEducationType("Full");
		empEducationBean.setLocation("Bangalore");
		empEducationBean.setUniversity("VTU");
		empEducationBean.setPercentage(90.5);
		empEducationBean.setYop(2012);
		
		Transaction transact = session.beginTransaction();
		
		session.save(empEducationBean);
		transact.commit();
		System.out.println("Success");
		session.close();
	}
}
