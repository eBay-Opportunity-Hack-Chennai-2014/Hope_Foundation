package com.abhilasha.jdbc.model;

public class Donor {
	private int id;
	private String name;
	private String address;
	private String city;
	private String state;
	private String country;
	private String mobile;
	private String email;
	private String otherDetails;
	
	public Donor(String name, String address, String city, String state, String country, String mobile, String email, String otherDetails) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobile = mobile;
		this.email = email;
		this.otherDetails = otherDetails;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
}
