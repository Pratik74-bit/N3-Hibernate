package org.tnsif.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class OneToManyBidirectional {
	
	public static void main(String[] args) {	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first employee
		Person p1=new Person();
		p1.setAadharNo(457652142356L);
		p1.setName("Narendra Modi");
		
		Person p2=new Person();
		p2.setAadharNo(457654142356L);
		p2.setName("Amit Shah");
		
		Contact c1 = new Contact();
		c1.setContactno(7564215369L);
		c1.setSimtype("Prepaid");
		
		Contact c2 = new Contact();
		c2.setContactno(9657215369L);
		c2.setSimtype("Postpaid");
		
		p1.setContact(c2);
		p2.setContact(c1);
		
		em.getTransaction().commit();
		System.out.println("Data added successfully");
		em.close();
	
		factory.close();

}
}