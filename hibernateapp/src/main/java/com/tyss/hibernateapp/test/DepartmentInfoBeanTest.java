package com.tyss.hibernateapp.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.bean.DepartmentInfoBean;

public class DepartmentInfoBeanTest {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		DepartmentInfoBean bean = new DepartmentInfoBean();

		bean.setDeptId(14);
		bean.setDeptName("HR");

		Transaction transact = session.beginTransaction();
		Serializable key = session.save(bean);

		System.out.println(" record with id " + key + " inserted");
		transact.commit();
	}
}
