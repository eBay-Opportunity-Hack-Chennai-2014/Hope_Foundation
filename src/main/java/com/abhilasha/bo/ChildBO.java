package com.abhilasha.bo;


public interface ChildBO {
	
	public int getAmountDonatedTillNow(int childid, int needid);
	public int getTotalAmount(int childid, int needid);
	public int getRequiredAmount(int childid, int needid);
}
