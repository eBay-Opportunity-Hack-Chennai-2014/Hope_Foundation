package com.abhilasha.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.abhilasha.jdbc.dao.DonationDAO;
import com.abhilasha.jdbc.model.Donation;

@Component
public class DonationDAOImpl implements DonationDAO{
	
	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
	@Override
	public Donation save(final Donation donation) {
		final String query = "INSERT INTO donor_child_need(donorid, childid, needid, date, amountdonated) values(?, ?, ?, ?, ?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();		
		getJdbcTemplate().update(new PreparedStatementCreator() {
	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	            ps.setInt(1, donation.getDonorid());
	            ps.setInt(2, donation.getChildid());
	            ps.setInt(3, donation.getNeedid());
	            ps.setString(4, donation.getDate());
	            ps.setInt(5, donation.getAmountdonated());
	            return ps;
	        }
	    }, keyHolder);
		donation.setId(keyHolder.getKey().intValue());
		return donation;
	}

}
