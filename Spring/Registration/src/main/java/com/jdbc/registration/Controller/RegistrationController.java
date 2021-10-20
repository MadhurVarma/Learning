package com.jdbc.registration.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.jdbc.registration.Model.RegistrationModel;
import com.jdbc.registration.Service.RegistrationService;

@SpringBootApplication

@RestController
@ComponentScan
@RequestMapping("/eduhubapi/v1")

public class RegistrationController {
	
	
	@Autowired(required=true)
	private RegistrationService registrationservice;
	
	@RequestMapping("/insert")
	//insert
	public String insert(@RequestBody RegistrationModel registrationmodel)
	{
		return registrationservice.insert(registrationmodel);
		
	}
	
	@RequestMapping("/update/{userid}")
	//update
	 String update(@RequestBody RegistrationModel registrationmodel, @PathVariable(name = "userid") int userid)
	
	{
		return registrationservice.update(registrationmodel,userid);
		
	}
	
	@RequestMapping("/select/{userid}")
	//selectone
	public RegistrationModel selectone(@PathVariable int userid)
	{
		return registrationservice.selectone(userid);
		
	}
	
	
	@RequestMapping("/delete/{userid}")
	//delete
		String deleteone(@PathVariable int userid)
	{
		return registrationservice.deleteone(userid);
		
	}
}


