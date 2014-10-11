package com.abhilasha.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.abhilasha.jdbc.dao.ChildDAO;
import com.abhilasha.jdbc.model.Child;

public class ChildDAOImpl implements ChildDAO {

	@Override
	public Child findByName(String name) {
		return null;
	}

	@Override
	public Child findById(int id) {
		return null;
	}

	@Override
	public Child save(Child donor) {
		return null;
	}
	
}
