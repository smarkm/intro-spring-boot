package org.smark.opensource.isb.validation;

import javax.validation.constraints.NotNull;

public class User {
	
	@NotNull( message="{user.name.null}")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@NotNull( message="password cannot be null")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String name; 
	private String password;
}
