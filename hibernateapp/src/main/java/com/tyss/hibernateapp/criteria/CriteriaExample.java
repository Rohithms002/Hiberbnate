package com.tyss.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateapp.bean.EmployeeInfoBean;
import com.tyss.hibernateapp.hql.SessionFactoryUtil;

public class CriteriaExample {

	public static void main(String[] args) {

		Session session = SessionFactoryUtil.getSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);

		Projection p1 = Projections.property("name");
		Projection p2 = Projections.property("id");


		ProjectionList pl = Projections.projectionList();// projection list

		pl.add(p1);
		pl.add(p2);
		
		
		criteria.setProjection(pl);

		List<Object[]> list1 = criteria.list();
		for (Object[] object : list1) {
			System.out.println(object[0]);
      
			System.out.println(object[1]);
		
		}
	}
}
