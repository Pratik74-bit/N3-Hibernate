package org.tnsif.bidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long AadharNo;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contactNo")
	private Contact contact;
	
	//Getter and setter
	public Long getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(Long aadharNo) {
		AadharNo = aadharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Person [AadharNo=" + AadharNo + ", name=" + name + ", contact=" + contact + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Long aadharNo, String name, Contact contact) {
		super();
		AadharNo = aadharNo;
		this.name = name;
		this.contact = contact;
	}
	
	
	
	
}
