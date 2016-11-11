package org.smark.opensource.isb.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class AppService {

	public User login(@Validated User user) {
		if ("smark".equals(user.getName()) && "123".equals(user.getPassword())) {
			return user;
		}
		return null;
	}
}
