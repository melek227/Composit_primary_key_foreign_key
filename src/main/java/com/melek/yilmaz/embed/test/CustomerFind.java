package com.melek.yilmaz.embed.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerFind {
	
	public static void main(String [] args) {
		long customerId=2;
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");
		EntityManager entityManager=factory.createEntityManager();
		
		Customer customer=entityManager.find(Customer.class, customerId);
		
		
		entityManager.close();
		
		
		System.out.println(customer.getCustomerId() + " " + customer.getCustomerName()+ " "
		+customer.getAddress().getProvinceName()+ " "
		) ;
		
	}
	

}
