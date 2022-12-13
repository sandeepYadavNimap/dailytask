package com.example.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Beans.Car;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Resources/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

//    	Car c1 = new  Car("TATA" ,"SUV",123233,"Disel");
//    	Car c2 = new Car("Ferrari","X10",1234234,"Petrol");
//    	Car c3 = new Car("Hundayi","Neo",324422,"Petrol");
//    	Car c4 = new  Car("MG" ,"VII",23445233,"Electric");
//    	
		Transaction t = s.beginTransaction();
//    	
//    	s.save(c1);
//    	s.save(c2);
//    	s.save(c3);
//    	s.save(c4);

		// dump data from one table to another table
//    	String hql =" insert into NewCar(id , name , model, price , type) select id,name,model,price,type from Car";
//     	Query q =s.createQuery(hql);
//    	q.executeUpdate();
//    	t.commit();

		// update through hql querry
//    	String hqlupdate="update Car Set name ='Suzuki' , model='Maruti101', price=120000,type='Electric' where id =3";
//    	Query q = s.createQuery(hqlupdate);
//    	q.executeUpdate();
//    	t.commit();

		// delete through hql query
//		String deletehql = "delete  from Car where id =3 ";
//		Query q = s.createQuery(deletehql);
//		int i =q.executeUpdate();
//		System.out.println(i+ "rows are Deleted");
		
		
		//getting all data from a table
//		String gethql=" from Car";
//		Query q =s.createQuery(gethql);
//		
//		List result = q.list();
//		
//		for(Object r : result) {
//			System.out.println(r);
//		}
//		
//		String hql ="select name , type from Car";
//		Query q =s.createQuery(hql);
//		List<Object> list =q.getResultList();
//		
//		for(Object o : list) {
//			Object arr[] =(Object[])o;
//			System.out.println(arr[0]);
//			System.out.println(arr[1]);
//			
//			}
		
		
		
			

		
		s.close();

	}
}

