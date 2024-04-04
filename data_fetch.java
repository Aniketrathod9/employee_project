package com.september;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class data_fetch {

	public static void main(String[] args) {
		SessionFactory sf=hibernetUtil.getfactory();
		Session ss=sf.openSession();
		
		emp ob=ss.load(emp.class,4);
		System.out.println(ob);
	}

}
