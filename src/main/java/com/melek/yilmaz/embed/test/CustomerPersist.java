package com.melek.yilmaz.embed.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.melek.yilmaz.embed.entity.Address;
import com.melek.yilmaz.embed.entity.Customer;

public class CustomerPersist {
	
	public static void main(String [] args) {
		
		
		Customer customer=new Customer();
		customer.setCustomerName("Melek Yılmaz");
		
		Address address=new Address();
		address.setProvinceName("istanbul");
		address.setDistrictName("Fatih");
		address.setAddressLine1("java.cad");
		address.setAddressLine1("hibernate sok.");
		
		customer.setAddress(address);//customer entitysinin içine gömülen Adress classının set metodu kullanıldı
		
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");
		EntityManager entityManager=factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		
		entityManager.persist(customer);
		
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		
		
	}

}
