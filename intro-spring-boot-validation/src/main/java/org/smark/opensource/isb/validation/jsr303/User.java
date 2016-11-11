package org.smark.opensource.isb.validation.jsr303;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {

	private String name;
	private String password;
	public User() {
		super();
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@NotNull
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Min(3)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
