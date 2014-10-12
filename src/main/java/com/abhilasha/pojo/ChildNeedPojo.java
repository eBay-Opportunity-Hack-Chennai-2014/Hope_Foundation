package com.abhilasha.pojo;

public class ChildNeedPojo {
	private int childId;
	private int needId;
	private int totalAmount;
	private int requiredAmount;
	private int amountDonated;
	
	public ChildNeedPojo(int childId, int needId, int total, int donated, int required) {
		this.childId = childId;
		this.needId = needId;
		this.totalAmount = total;
		this.amountDonated = donated;
		this.requiredAmount = required;
	}
	
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public int getNeedId() {
		return needId;
	}
	public void setNeedId(int needId) {
		this.needId = needId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getRequiredAmount() {
		return requiredAmount;
	}
	public void setRequiredAmount(int requiredAmount) {
		this.requiredAmount = requiredAmount;
	}
	public int getAmountDonated() {
		return amountDonated;
	}
	public void setAmountDonated(int amountDonated) {
		this.amountDonated = amountDonated;
	}
	public String getNeedType() {
		if (needId == 1) return "Food";
		if (needId == 2) return "Education";
		if (needId == 3) return "Medical";
		if (needId == 4) return "Clothing";
		return "";
	}
}
