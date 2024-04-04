package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		SessionFactory sf=hibernetUtil.getfactory();
		
		System.out.println(sf);
		
		Address as=new Address(2,"pune","Baner");
		
		Employee ob=new Employee(101,"mayur","3600000",as);
		
		Session ss=sf.openSession();
		Transaction tf=ss.beginTransaction();
		
		ss.save(as);
		ss.save(ob);
		
		tf.commit();
		
		ss.close();
	}

}
