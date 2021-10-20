package com.jdbc.registration.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jdbc.registration.Model.RegistrationModel;

@Service
@Component
public interface RegistrationService {
	
	public String insert(RegistrationModel registrationmodel);
	
	//public String update( RegistrationModel registrationmodel,RegistrationModel userid);
	public String update(RegistrationModel registrationmodel,int userid);
	public RegistrationModel selectone(int userid);
	public String deleteone(int userid);
	

}






