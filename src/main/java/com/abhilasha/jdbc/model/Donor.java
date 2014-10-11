package com.abhilasha.jdbc.model;

public class Donor {
	private int id;
	private String name;
	private String dob;
	private String address;
	private String mobile;
	private String phNoRes;
	private String phNoOfc;
	private String email;
	
	public Donor(String name, String dob, String address, String phNoRes, String phNoOfc, String mobile, String email) {
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.phNoRes = phNoRes;
		this.phNoOfc = phNoOfc;
		this.dob = dob;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhoneNoRes() {
		return phNoRes;
	}

	public void setPhoneNoRes(String phoneNoRes) {
		this.phNoRes = phoneNoRes;
	}

	public String getPhoneNoOfc() {
		return phNoOfc;
	}

	public void setPhoneNoOfc(String phoneNoOfc) {
		this.phNoOfc = phoneNoOfc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
