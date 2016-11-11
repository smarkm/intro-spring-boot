package org.smark.opensource.isb.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Test;
import org.smark.opensource.isb.validation.jsr303.StandValidator;
import org.smark.opensource.isb.validation.jsr303.User;

public class Jsr303Test {

	@Test
	public void jsr303() throws Exception {
		StandValidator validator = new StandValidator();
		User user = new User("smark","1");
		Set<ConstraintViolation<User>> errors ;
		errors = validator.validate(user, User.class);
		System.out.println(errors);
		printErrors(errors);
	}
	
	private static  void printErrors(Set<ConstraintViolation<User>> errors){
		for (ConstraintViolation constraintViolation : errors) {
			System.out.println(constraintViolation.getMessage());
		}
	}
}
