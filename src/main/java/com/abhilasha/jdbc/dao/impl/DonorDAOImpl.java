package com.abhilasha.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.abhilasha.jdbc.dao.DonorDAO;
import com.abhilasha.jdbc.model.Donor;

public class DonorDAOImpl implements DonorDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	@Override
	public Donor findDonarByName(String name) {
		String query = "SELECT * FROM donorregistration where donorName = ?";
		Donor donor = getJdbcTemplate().queryForObject(query, new Object[] { name },
				new RowMapper<Donor>() {

					@Override
					public Donor mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Donor donor = new Donor(rs.getString("donorName"), rs
								.getString("donorAddress"), rs
								.getString("donorCity"), rs
								.getString("donorState"), rs
								.getString("donorCountry"), rs
								.getString("donorEmail"), rs
								.getString("donorMobile"), rs
								.getString("donorOtherDetails"));
						donor.setId(rs.getInt("donorKey"));
						// donor.setId(rs.getInt("donorKey"));
						// donor.setName(rs.getString("donorName"));
						// donor.setAddress(rs.getString("donorAddress"));
						// donor.setCity(rs.getString("donorCity"));
						// donor.setState(rs.getString("donorState"));
						// donor.setCountry(rs.getString("donorCountry"));
						// donor.setEmail(rs.getString("donorEmail"));
						// donor.setMobile(rs.getString("donorMobile"));
						// donor.setOtherDetails(rs.getString("donorOtherDetails"));
						return donor;
					}
				});

		return donor;
	}

	@Override
	public Donor save(final Donor donor) {
		final String query = "INSERT INTO abhilasha.donorregistration(donorName, donorAddress, donorCity, donorState, donorCountry, donorEmail, donorMobile, donorOtherDetails) values(?,?,?,?,?,?,?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();		
		getJdbcTemplate().update(new PreparedStatementCreator() {
	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	            ps.setString(1, donor.getName());
	            ps.setString(2, donor.getAddress());
	            ps.setString(3, donor.getCity());
	            ps.setString(4, donor.getState());
	            ps.setString(5, donor.getCountry());
	            ps.setString(6, donor.getMobile());
	            ps.setString(7, donor.getEmail());
	            ps.setString(8, donor.getOtherDetails());
	            return ps;
	        }
	    }, keyHolder);
		donor.setId(keyHolder.getKey().intValue());
		return donor;
	}

}
