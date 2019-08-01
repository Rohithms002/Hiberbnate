package com.tyss.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.bean.EmployeeInfoBean;



public class EmployeeTest {

	public static void main(String[] args) {
       Session session =SessionFactoryUtil.getSession();
		Query<EmployeeInfoBean> query = session.createQuery("from EmployeeInfoBean");
		List<EmployeeInfoBean> list = query.list();
		System.out.println(list);
		
		Query<EmployeeInfoBean> query1 = session.createQuery("select name from EmployeeInfoBean");
		List<EmployeeInfoBean> list1 = query1.list();
	
		System.out.println(list1);
	}

}
