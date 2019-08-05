package com.nguyenanhtu.customer.model;

public class Customer {
	int custId;
	String name;
	int age;
	
	public Customer(int i, String n, int a) {
		this.custId = i;
		this.name = n;
		this.age = a;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public int getCustId() {
		return this.custId;
	}
	public void setCustId(int i) {
		this.custId = i;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}
}
