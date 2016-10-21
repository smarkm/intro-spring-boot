package org.smark.opensource.isb.validation;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class User {
	
	@NotNull( message="name cannot be null")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String name; 
	private String password;
}
