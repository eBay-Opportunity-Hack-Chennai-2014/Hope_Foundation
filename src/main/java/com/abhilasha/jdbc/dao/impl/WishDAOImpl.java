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

import com.abhilasha.jdbc.dao.WishDAO;
import com.abhilasha.jdbc.model.Donor;
import com.abhilasha.jdbc.model.Wish;

@Component
public class WishDAOImpl implements WishDAO {

	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
	@Override
	public Wish save(final Wish wish) {
		final String query = "INSERT INTO wish(childid, wishdesc) VALUES(?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();		
		getJdbcTemplate().update(new PreparedStatementCreator() {
	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	            ps.setInt(1, wish.getChildId());
	            ps.setString(2, wish.getWish());
	            return ps;
	        }
	    }, keyHolder);
		wish.setId(keyHolder.getKey().intValue());
		wish.setDonatedAmount(0);
		return wish;
	}

	@Override
	public Wish findWishByChildId(final int childId) {
		final String query = "SELECT * FROM wish where childid = ?";
		Wish wish = null;
		try {
			wish = getJdbcTemplate().queryForObject(query, new Object[] { childId },
					new RowMapper<Wish>() {
	
						@Override
						public Wish mapRow(ResultSet rs, int rowNum)
								throws SQLException {
							Wish wish = new Wish();
							wish.setId(rs.getInt("id"));
							wish.setChildId(childId);
							wish.setWish(rs.getString("wishdesc"));
							return wish;
						}
					});
			final String query2 = "SELECT SUM(amountdonated) FROM wish where childid = ?";
			Integer amt = getJdbcTemplate().queryForInt(query2, new Object[] {childId}, new RowMapper<Integer>(){
	
				@Override
				public Integer mapRow(ResultSet rs, int arg1) throws SQLException {
					return rs.getInt(0);
				}
				
			});
			wish.setDonatedAmount(amt);
		} catch(Exception e) {
			
		}
		return wish;
	}
	
}
