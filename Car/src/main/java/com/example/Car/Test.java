package com.example.Car;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import Beans.Car;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("Resources/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		//getting all data
//		Criteria q = s.createCriteria(Car.class); //internally go through select * from car
//		List<Car> list = q.list();
//		
//		for(Car c : list) {
//			System.out.println(c);
//		} 
		
		Criteria c =s.createCriteria(Car.class);
//		Criterion cr=Restrictions.eq("id", 1);
//		c.add(cr);
//		Car c1 =(Car)c.uniqueResult();
		//System.out.println(c1);
		
//		Criterion cr = Restrictions.gt("id", 1);
//		c.add(cr);
//		List<Car> c1 =c.list();
//		System.out.println(c1);
		
		Projection p = Projections.property("name");
		c.setProjection(p);
		List<String> list =c.list();
		System.out.println(list);
	//	s.close();
		
		
		
		
	}
}
