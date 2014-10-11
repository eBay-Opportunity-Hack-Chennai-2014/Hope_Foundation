package com.abhilasha.bo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.abhilasha.bo.ChildBO;

@Component
public class ChildBOImpl implements ChildBO {

	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
	public int getAmountDonatedTillNow(int childid, int needid) {
		String query = "SELECT sum(amountdonated) AS amountdonated FROM donor_child_need where childid = ? AND needid = ?";
		Integer i = getJdbcTemplate().queryForObject(query, new Object[] { childid, needid },
				new RowMapper<Integer>() {

					@Override
					public Integer mapRow(ResultSet rs, int rowNum)
							throws SQLException {
							return rs.getInt("amountdonated");
					}
					
				});
		return i;
	}
	

	@Override
	public int getTotalAmount(int childid, int needid) {
		String query = "SELECT amount FROM need where id = ?";
		Integer i = getJdbcTemplate().queryForObject(query, new Object[] { needid },
				new RowMapper<Integer>() {

					@Override
					public Integer mapRow(ResultSet rs, int rowNum)
							throws SQLException {
							return (12 * rs.getInt("amount"));
					}
					
				});
		return i;
	}

	@Override
	public int getRequiredAmount(int childid, int needid) {
		return (getTotalAmount(childid, needid) - getAmountDonatedTillNow(childid, needid));
	}

}
