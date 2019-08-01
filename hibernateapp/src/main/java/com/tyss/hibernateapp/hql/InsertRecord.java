package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public interface InsertRecord {

	public static void main(String[] args) {
		
		Session session=SessionFactoryUtil.getSession();
        String hql = "insert into EmployeeNew (eid, name, email) select id ,name ,email from EmployeeInfoBean"; 	
        Query query=session.createQuery(hql);
	    Transaction transaction= null;
	    
	    try {
			transaction =session.beginTransaction();
			int rows=query.executeUpdate();
			transaction.commit();
			System.out.println("no of rows affected " + rows);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
	
}
