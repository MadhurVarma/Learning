package com.jdbc.registration.Dao.Impl;

import org.springframework.stereotype.Component;

import com.jdbc.registration.Model.RegistrationModel;

@Component
public interface RegistrationDAO {
	
	
	//insert
	int save(RegistrationModel registrationmodel);
	int update(RegistrationModel registrationmodel,int userid);
	RegistrationModel selectone(int userid);
	int deleteone(int userid);

}


