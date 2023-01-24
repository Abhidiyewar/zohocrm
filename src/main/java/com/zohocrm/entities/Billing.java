package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bills")
public class Billing {
	
	@Id
	@GeneratedValue( strategy =  GenerationType.IDENTITY)
	private  long id;
	
	@Column(name = "first_name",nullable = false, length = 45)
	private String firstName;
	
	@Column(name = "last_name",nullable = false, length = 45)
	private String lastname;
	
	@Column(name = "email",nullable = false, length = 145,  unique = true)
	private String email;
	
	@Column(name = "mobile",nullable = false, length = 45, unique = true)
	private long mobile;
	
	@Column(name = "product",nullable = false, length = 45)
	private String product;
	
	@Column(name = "amount",nullable = false, length = 45)
	private String amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	

}
