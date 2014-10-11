package com.abhilasha.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.abhilasha.jdbc.dao.ChildNeedDAO;
import com.abhilasha.jdbc.dao.DonorDAO;
import com.abhilasha.jdbc.model.ChildNeed;
import com.abhilasha.jdbc.model.Donor;

public class ChildNeedDAOImpl implements ChildNeedDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	@Override
	public ChildNeed findNeedByChildId(int childId) {
		String query = "SELECT * FROM child_need where childid = ?";
		ChildNeed childNeed = getJdbcTemplate().queryForObject(query, new Object[] { childId },
				new RowMapper<ChildNeed>() {

					@Override
					public ChildNeed mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						ChildNeed childNeed = new ChildNeed (rs.getInt("childid"));
						ArrayList<Integer> needids = new ArrayList<Integer>();
						while(rs.next()) {
							needids.add(rs.getInt("needid"));
						}
						childNeed.setNeedid(needids);
						return childNeed;
					}
				});

		return childNeed;
	}

	@Override
	public ChildNeed save(final ChildNeed childNeed) {
		final String query = "INSERT INTO abhilasha.child_need(childid, needid) values(?,?)";
		for (final int i = 0; i < childNeed.getNeedid().size(); i++) {
		KeyHolder keyHolder = new GeneratedKeyHolder();		
		getJdbcTemplate().update(new PreparedStatementCreator() {
	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	            ps.setInt(1, childNeed.getChildid());
	            ps.setInt(2, childNeed.getNeedid().get(i));
	            return ps;
	        }
	    }, keyHolder);
		childNeed.setId(keyHolder.getKey().intValue());
		return childNeed;
	}
		return childNeed;
	}
	
}

