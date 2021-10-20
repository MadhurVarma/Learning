package com.jdbc.registration.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

public class RegistrationModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userid;
	private String username;
	private String designation;
	private int experience;
	private String skill;
	private LocalDateTime LocalDateTime;
	private LocalDateTime lastmodified;
	
	public RegistrationModel(){
			super();
	}
	public RegistrationModel(int userid, String username, String designation, int experience, String skill,
			java.time.LocalDateTime localDateTime) {
		super();
		this.userid = userid;
		this.username = username;
		this.designation = designation;
		this.experience = experience;
		this.skill = skill;
		LocalDateTime = localDateTime;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public LocalDateTime getLocalDateTime() {
		return LocalDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		LocalDateTime = localDateTime;
	}
	
	public LocalDateTime getLastModified() {
		return lastmodified;
	}

	public void setLastModified(LocalDateTime lastmodified) {
		this.lastmodified=lastmodified;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Registration [userid=");
		builder.append(userid);
		builder.append(", username=");
		builder.append(username);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", experience=");
		builder.append(experience);
		builder.append(", skill=");
		builder.append(skill);
		builder.append(", LocalDateTime=");
		builder.append(LocalDateTime);
		builder.append("]");
		return builder.toString();
	}

}
