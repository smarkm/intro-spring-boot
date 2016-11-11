package org.smark.opensource.isb.validation;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class IntroSpringBootValidationApplicationTests {
	@Resource
	AppService service;
	
	@Resource
	Validator validator;

	@Test
	public void contextLoads() {
		User user = new User();
		service.login(user);
		for (ConstraintViolation<User> m : validator.validate(user)) {
			System.out.println(m.getMessage());
		}
		System.out.println(user);
	}

}
