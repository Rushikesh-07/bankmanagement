package com.system.management.bank.entity;

import javax.persistence.Entity;

@Entity
public class Customer {
	
	private long custid;
	private String name;
	private String phone;
	private String address;
	
	public long getCustid() {
		return custid;
	}
	public void setCustid(long custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	
	
}
