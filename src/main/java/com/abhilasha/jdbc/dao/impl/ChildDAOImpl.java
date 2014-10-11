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

import com.abhilasha.jdbc.dao.ChildDAO;
import com.abhilasha.jdbc.model.Child;
import com.abhilasha.jdbc.model.Donor;

@Component
public class ChildDAOImpl implements ChildDAO {

	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
	@Override
	public Child findByName(String name) {
		String query = "SELECT * FROM child where name = ?";
		Child child = getJdbcTemplate().queryForObject(query, new Object[] { name },
				new RowMapper<Child>() {

					@Override
					public Child mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Child child = new Child(rs.getString("name"),
								rs.getString("admissionNumber"),
								rs.getString("dob"),
								rs.getInt("age"),
								rs.getInt("sex"),
								rs.getString("std"),
								rs.getString("fatherName"),
								rs.getString("fatherEducation"),
								rs.getString("fatherEmployment"),
								rs.getString("motherName"),
								rs.getString("motherEducation"),
								rs.getString("motherEmployment"),
								rs.getString("familyHistroy"),
								rs.getString("addess"),
								rs.getInt("familyIncome"),
								rs.getString("category"),
								rs.getInt("hivInfection"),
								rs.getInt("parentsHadhiv"),
								rs.getString("conduct"),
								rs.getString("academicPerformance"),
								rs.getString("dream"),
								rs.getString("schoolImpact"));
						child.setId(rs.getInt("id"));
						return child;
					}
				});
		return child;
	}

	@Override
	public Child findById(int id) {
		String query = "SELECT * FROM child where id = ?";
		Child child = getJdbcTemplate().queryForObject(query, new Object[] { id },
				new RowMapper<Child>() {

					@Override
					public Child mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Child child = new Child(rs.getString("name"),
								rs.getString("admissionNumber"),
								rs.getString("dob"),
								rs.getInt("age"),
								rs.getInt("sex"),
								rs.getString("std"),
								rs.getString("fatherName"),
								rs.getString("fatherEducation"),
								rs.getString("fatherEmployment"),
								rs.getString("motherName"),
								rs.getString("motherEducation"),
								rs.getString("motherEmployment"),
								rs.getString("familyHistroy"),
								rs.getString("addess"),
								rs.getInt("familyIncome"),
								rs.getString("category"),
								rs.getInt("hivInfection"),
								rs.getInt("parentsHadhiv"),
								rs.getString("conduct"),
								rs.getString("academicPerformance"),
								rs.getString("dream"),
								rs.getString("schoolImpact"));
						child.setId(rs.getInt("id"));
						return child;
					}
				});
		return child;
	}

	@Override
	public Child save(final Child child) {
		final String query = "INSERT INTO `abhilasha`.`child`(`admissionnumber`,`name`,`dob`,`age`,`sex`,`std`,`fathername`,`fathereducation`,`fatheremployment`,`mothername`,`mothereducation`,`motheremployment`,`familyhistory`,`address`,`familyincome`,`category`,`hivinfection`,`parentshadhiv`,`conduct`,`academicperformance`,`dream`,`schoolimpact`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		KeyHolder keyHolder = new GeneratedKeyHolder();		
		getJdbcTemplate().update(new PreparedStatementCreator() {
	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	            ps.setString(1, child.getAdmissionNumber());
	            ps.setString(2, child.getName());
	            ps.setString(3, child.getDob());
	            ps.setInt(4, child.getAge());
	            ps.setInt(5, child.getSex());
	            ps.setString(6, child.getStd());
	            ps.setString(7, child.getFatherName());
	            ps.setString(8, child.getFatherEducation());
	            ps.setString(9, child.getFatherEmployment());
	            ps.setString(10, child.getMotherName());
	            ps.setString(11, child.getMotherEducation());
	            ps.setString(12, child.getMotherEmployment());
	            ps.setString(13, child.getFamilyHistroy());
	            ps.setString(14, child.getAddess());
	            ps.setInt(15, child.getFamilyIncome());
	            ps.setString(16, child.getCategory());
	            ps.setInt(17, child.getHivInfection());
	            ps.setInt(18, child.getParentsHadhiv());
	            ps.setString(19, child.getConduct());
	            ps.setString(20, child.getAcademicPerformance());
	            ps.setString(21, child.getDream());
	            ps.setString(22, child.getSchoolImpact());
	            return ps;
	        }
	    }, keyHolder);
		child.setId(keyHolder.getKey().intValue());
		return child;
	}
	
}
