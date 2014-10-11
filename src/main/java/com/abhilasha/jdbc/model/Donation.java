package com.abhilasha.jdbc.model;

public class Donation {
	private int id;
	private int donorid;
	private int childid;
	private int needid;
	private String date;
	private int amountdonated;
	
	public Donation(int donorid, int childid, int needid, String date, int amountdonated) {
		this.donorid = donorid;
		this.childid = childid;
		this.needid = needid;
		this.date = date;
		this.amountdonated = amountdonated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDonorid() {
		return donorid;
	}

	public void setDonorid(int donorid) {
		this.donorid = donorid;
	}

	public int getChildid() {
		return childid;
	}

	public void setChildid(int childid) {
		this.childid = childid;
	}

	public int getNeedid() {
		return needid;
	}

	public void setNeedid(int needid) {
		this.needid = needid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmountdonated() {
		return amountdonated;
	}

	public void setAmountdonated(int amountdonated) {
		this.amountdonated = amountdonated;
	}
}
