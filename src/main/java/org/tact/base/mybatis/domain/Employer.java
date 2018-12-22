package org.tact.base.mybatis.domain;

import java.io.Serializable;

public class Employer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String linkedin;

	private String website;
	
	private String region;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}

     public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return getId() + "," + getName() + "," + getLinkedin() + "," + getWebsite() + "," + getWebsite();
	}	
}