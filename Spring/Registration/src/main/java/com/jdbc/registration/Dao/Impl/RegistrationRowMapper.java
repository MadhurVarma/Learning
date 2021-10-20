package com.jdbc.registration.Dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.registration.Model.RegistrationModel;

public class RegistrationRowMapper implements RowMapper<RegistrationModel> {
	
	@Override
	public RegistrationModel mapRow(ResultSet rs,int rowNum) throws SQLException{	
	
	
		RegistrationModel registrationmodel = new RegistrationModel();
		
		registrationmodel.setUserid(rs.getInt("userid"));
		registrationmodel.setUsername(rs.getString("username"));
		registrationmodel.setDesignation(rs.getString("designation"));
		registrationmodel.setExperience(rs.getInt("experience"));
		registrationmodel.setSkill(rs.getString("skill"));
		registrationmodel.setLastModified(rs.getTimestamp("lastmodified").toLocalDateTime());
		registrationmodel.setLastModified(rs.getTimestamp("lastmodified").toLocalDateTime());
				

		return registrationmodel;
	}

}
