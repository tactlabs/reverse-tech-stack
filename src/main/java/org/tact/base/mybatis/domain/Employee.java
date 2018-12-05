package org.tact.base.mybatis.domain;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long employer_id;

	private String linkedin;

	private String skills;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getEmployer_id() {
		return employer_id;
	}


	public void setEmployer_id(Long employer_id) {
		this.employer_id = employer_id;
	}


	public String getLinkedin() {
		return linkedin;
	}


	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	@Override
	public String toString() {
		return getId() + "," + getEmployer_id() + "," + getLinkedin() + "," + getSkills();
	}	
}