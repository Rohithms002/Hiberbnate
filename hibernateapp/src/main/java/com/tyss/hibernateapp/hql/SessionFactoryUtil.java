package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static Session session;

	private SessionFactoryUtil() {
	}

	public static Session getSession() {

		if (session == null) {
			session = new Configuration().configure().buildSessionFactory().openSession();
		}
		return session;
	}
}
