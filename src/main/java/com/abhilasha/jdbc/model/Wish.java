package com.abhilasha.jdbc.model;

public class Wish {
	private int id;
	private String wish;
	private int donatedAmount;
	private int childId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWish() {
		return wish;
	}
	public void setWish(String wish) {
		this.wish = wish;
	}
	public int getDonatedAmount() {
		return donatedAmount;
	}
	public void setDonatedAmount(int donatedAmount) {
		this.donatedAmount = donatedAmount;
	}
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
}
