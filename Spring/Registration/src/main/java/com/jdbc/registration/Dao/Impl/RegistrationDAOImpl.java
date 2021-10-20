package com.jdbc.registration.Dao.Impl;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.registration.Model.RegistrationModel;

@Repository

public class RegistrationDAOImpl implements RegistrationDAO {

@Autowired	
private JdbcTemplate jdbctemplate;

// to access the app properties
	@Value("${education.registration.insert}")
		private String insertStatement;
	@Value("${education.registration.update}")
	private String updateStatement;
	@Value("${education.registration.selectone}")
	private String selectoneStatement;
	@Value("${education.registration.delete}")
	private String deleteoneStatement;

	
	@Override
	public int save(RegistrationModel registrationmodel){
					
		LocalDateTime localdatetime=LocalDateTime.now();
		registrationmodel.setLocalDateTime(localdatetime);
		
		return jdbctemplate.update(insertStatement,registrationmodel.getUserid(),registrationmodel.getUsername(),registrationmodel.getSkill(),registrationmodel.getExperience(),registrationmodel.getDesignation(),registrationmodel.getLocalDateTime());
	}
	
	@Override
	public int update(RegistrationModel registrationmodel,int userid){
			
		LocalDateTime localdatetime=LocalDateTime.now();
		registrationmodel.setLocalDateTime(localdatetime);
		
		return jdbctemplate.update(updateStatement,registrationmodel.getUsername(),registrationmodel.getSkill(),registrationmodel.getExperience(),registrationmodel.getDesignation(),registrationmodel.getLocalDateTime(),registrationmodel.getUserid());
	}

	@Override
		public RegistrationModel selectone(int userid){
		
		return jdbctemplate.queryForObject(selectoneStatement, new RegistrationRowMapper(), new Object[] {userid});
				
		}

	@Override
	public int deleteone(int userid){
		
		return jdbctemplate.update(deleteoneStatement, userid);
			
	}
}

