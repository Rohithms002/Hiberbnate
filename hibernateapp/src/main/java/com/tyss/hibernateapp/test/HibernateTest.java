package com.tyss.hibernateapp.test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.bean.DepartmentInfoBean;
import com.tyss.hibernateapp.bean.EmployeeInfoBean;

public class HibernateTest {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		EmployeeInfoBean employeeBean = new EmployeeInfoBean();
		employeeBean.setId(25);
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

		EmployeeInfoBean employeeBean1 = new EmployeeInfoBean();
		employeeBean1.setId(26);
		employeeBean1.setName("Spoorthy");
		employeeBean1.setAccountNumber("55145112023");
		employeeBean1.setAge(24);
		employeeBean1.setDob(java.sql.Date.valueOf("1992-02-05"));
		employeeBean1.setEmail("Spoorthy@testyantra.com");
		employeeBean1.setGender("Female");
		employeeBean1.setJoiningDate(java.sql.Date.valueOf("2015-02-05"));
		employeeBean1.setMngrId(3);
		employeeBean1.setDesignation("SE");
		employeeBean1.setPhone(92534711);
		employeeBean1.setSalary(25000);

		ArrayList<EmployeeInfoBean> list1 = new ArrayList<>();
		list1.add(employeeBean);
		list1.add(employeeBean1);
		DepartmentInfoBean bean1 = new DepartmentInfoBean();

		bean1.setDeptId(25);
		bean1.setDeptName("HR");
		bean1.setEmployeeInfoBean(list1);

		DepartmentInfoBean bean2 = new DepartmentInfoBean();

		bean2.setDeptId(26);
		bean2.setDeptName("FINANCE");

		Transaction transact = session.beginTransaction();

		session.save(bean1);
		session.save(bean2);

		transact.commit();

		session.close();

	}
}
