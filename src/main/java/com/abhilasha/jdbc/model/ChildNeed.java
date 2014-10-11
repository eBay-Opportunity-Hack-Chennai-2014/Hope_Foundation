package com.abhilasha.jdbc.model;

import java.util.ArrayList;

public class ChildNeed {
	private int id;
	private int childid;
	private ArrayList<Integer> needid;
	
	public ChildNeed (int childid) {
		this.childid = childid;
	}

	public int getChildid() {
		return childid;
	}

	public void setChildid(int childid) {
		this.childid = childid;
	}

	public ArrayList<Integer> getNeedid() {
		return needid;
	}

	public void setNeedid(ArrayList<Integer> needid) {
		this.needid = needid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
