package com.abhilasha.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.abhilasha.jdbc.dao.DonorDAO;
import com.abhilasha.jdbc.model.Donor;

@Component
public class DonorDAOImpl implements DonorDAO {

	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	@Override
	public Donor findDonarByName(String name) {
		String query = "SELECT * FROM donor where name = ?";
		Donor donor = getJdbcTemplate().queryForObject(query, new Object[] { name },
				new RowMapper<Donor>() {

					@Override
					public Donor mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Donor donor = new Donor(rs.getString("name"),rs.getString("dob"),rs.getString("address"),rs.getString("phno_res"),rs.getString("phno_ofc"),rs.getString("mobile"),rs.getString("email"));
						donor.setId(rs.getInt("id"));
						return donor;
					}
				});
		return donor;
	}

	@Override
	public Donor save(final Donor donor) {
		final String query = "INSERT INTO donor(name, dob, address, phno_res, phno_ofc, mobile, email) values(?, ?, ?, ?, ?, ?, ?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();		
		getJdbcTemplate().update(new PreparedStatementCreator() {
	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	            ps.setString(1, donor.getName());
	            ps.setString(2, donor.getDob());
	            ps.setString(3, donor.getAddress());
	            ps.setString(4, donor.getPhoneNoRes());
	            ps.setString(5, donor.getPhoneNoOfc());
	            ps.setString(6, donor.getMobile());
	            ps.setString(7, donor.getEmail());
	            return ps;
	        }
	    }, keyHolder);
		donor.setId(keyHolder.getKey().intValue());
		return donor;
	}

	@Override
	public Donor findDonarById(int id) {
		String query = "SELECT * FROM donor where id = ?";
		Donor donor = getJdbcTemplate().queryForObject(query, new Object[] { id },
				new RowMapper<Donor>() {

					@Override
					public Donor mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Donor donor = new Donor(rs.getString("name"),rs.getString("dob"),rs.getString("address"),rs.getString("phno_res"),rs.getString("phno_ofc"),rs.getString("mobile"),rs.getString("email"));
						donor.setId(rs.getInt("id"));
						return donor;
					}
				});
		return donor;
	}

}
