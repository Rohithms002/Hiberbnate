package com.tyss.hibernateapp.test;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.tyss.hibernateapp.hql.SessionFactoryUtil;

public class StoredProceduraCAll {

	public static void main(String[] args) {

		Session session = SessionFactoryUtil.getSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("sp1");
		List<Object[]> object = query.getResultList();
		for (Object[] ob : object) {

			for (int i = 0; i < object.size(); i++)
				System.out.println(ob[i]);
		}

	}
}
