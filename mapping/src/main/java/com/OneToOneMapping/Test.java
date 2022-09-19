package com.OneToOneMapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Customer customer = new Customer();
		customer.setFirstName("sohan");
		customer.setMobileNumber("56378588");

		Transection transection = new Transection();
		transection.setDate(new Date());
		transection.setTotal(5000);
		customer.setTransection(transection);
		session.save(customer);
		t.commit();
		session.close();
		sessionFactory.close();

	}
}
