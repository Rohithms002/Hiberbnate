package com.tyss.hibernateapp.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.bean.TrainingInfoBean;

public class TrainingInfoBeanTest {

	public static void main(String[] args) {
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        
		TrainingInfoBean infoBean = new TrainingInfoBean();
		infoBean.setCourseId(11);
		infoBean.setCourseName("JAVA");
		infoBean.setDuration("12 Months");
		infoBean.setType("No type");
		
		Transaction transaction = session.beginTransaction();
		
		session.save(infoBean);
		transaction.commit();
	}
}
