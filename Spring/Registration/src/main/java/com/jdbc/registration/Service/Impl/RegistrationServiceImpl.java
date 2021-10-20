package com.jdbc.registration.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jdbc.registration.Dao.Impl.RegistrationDAO;
import com.jdbc.registration.Model.RegistrationModel;
import com.jdbc.registration.Service.RegistrationService;

@Repository
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDAO regdao;

	// insert

	@Override
	public String insert(RegistrationModel registrationmodel) {
		String message = "";

		int response = regdao.save(registrationmodel);
		if (response != 0)
			message = "Sucessfully inserted";
		else
			message = "Insertion failed";

		return message;
	}

	// update
	@Override
	//public String update(RegistrationModel registrationmodel,RegistrationModel userid) {
	public String update(RegistrationModel registrationmodel,int userid) {
		
		String message = "";

		int response = regdao.update(registrationmodel,userid);
		if (response != 0)
			message = "Sucessfully updated";
		else
			message = "Update not sucessful";

		return message;
	}
	//select one
	@Override
	public RegistrationModel selectone(int userid){


		return regdao.selectone(userid);
		
	}
	
	//deletone
	@Override
	public String deleteone(int userid)
	{
		
		String message = "";

		int response = regdao.deleteone(userid);
		if (response != 0)
			message = "Sucessfully deleted";
		else
			message = "delete not sucessful";

		return message;
	}

}
