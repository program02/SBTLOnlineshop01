package com.exam;

import java.sql.Date;

public class User {
	int id;
	String name;
	String email;
	String designation;
	String phone;
	Date joinDate;

	public User() {
		super();
	}

	public User(int id) {
		super();
		this.id = id;
	}

	
	public User(int id, String name, String email, String designation, String phone, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.phone = phone;
		this.joinDate = joinDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", designation=" + designation + ", phone="
				+ phone + ", joinDate=" + joinDate + "]";
	}

	
}
