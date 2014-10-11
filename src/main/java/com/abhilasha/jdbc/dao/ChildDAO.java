package com.abhilasha.jdbc.dao;

import com.abhilasha.jdbc.model.Child;

public interface ChildDAO {
	public Child findByName(String name);
	public Child findById(int id);
	public Child save(Child child);
}
