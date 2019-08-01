package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.bean.EmployeeInfoBean;

public class UpdateRecord {

	public static void main(String[] args) {

		Session session = SessionFactoryUtil.getSession();
		Query query   = session.createQuery("update EmployeeInfoBean set name ='Girish' where id =2");
		Query query2  = session.createQuery("update EmployeeInfoBean set name ='gggg' where id = "+args[0]+"");
		Query query1  = session.createQuery("delete from EmployeeInfoBean where id= 2");
		//query.setParameter("eid", 2);
		int rows = 0;
		Transaction transact = null;
		try {
			transact = session.beginTransaction();
			rows = query2.executeUpdate();
			transact.commit();
			System.out.println("no of rows affected" + rows);
		} catch (Exception e) {
			e.printStackTrace();
			transact.rollback();
		} finally {
			session.close();
		}
	}// End of Main
}// End of class
