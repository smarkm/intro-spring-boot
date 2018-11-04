package org.smark.opensource.isb.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

	@Bean
	public String name() {
		System.err.println("test environment profile");
		return "test";
	}
}
